import java.util.*;;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int l = 0, r = 0;
        int formed = 0, required = need.size()  ;
        int min = s.length();
        int start = 0, end = 0;
        while (r < s.length()) {
            char currR = s.charAt(r);
            if (need.containsKey(currR)) {
                window.put(currR, window.getOrDefault(currR, 0) + 1);
                if (window.get(currR) == need.get(currR)) {
                    formed++;
                }
            }
            while (formed == required) {
                int len = r - l + 1;
                char currL = s.charAt(l);
                if (min > len) {
                    min = len;
                    start = l;
                    end = r;
                }
                if (window.containsKey(currL)) {
                    window.put(currL, window.get(currL) - 1);
                    if (window.get(currL) < need.get(currL)) {
                        formed--;
                    }
                    if (window.get(currL) == 0) {
                        window.remove(currL);
                    }
                }
                l++;
            }
            r++;
        }
        System.out.println("Minimum Window SubString is: " + s.substring(start, end + 1));

    }
}
