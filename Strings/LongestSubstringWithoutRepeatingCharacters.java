import java.util.*;;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "pwwkew";
        int l = 0, r = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < str.length()) {
            if (map.containsKey(str.charAt(r))) {
                while (l < str.length() && map.containsKey(str.charAt(l))) {
                    map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                    if (map.get(str.charAt(l)) == 0) {
                        map.remove(str.charAt(l));
                    }
                    l++;
                }
            }
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            max = Math.max(max, r - l + 1);
            r++;
        }
        System.out.println(max);
    }
}
