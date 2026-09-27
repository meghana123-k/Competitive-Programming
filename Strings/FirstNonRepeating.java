import java.util.HashMap;

class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "loveleetcode";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        boolean found = false;
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                found = true;
                System.out.println(i);
                break;
            }
        }
        if(!found) {
            System.out.println(-1);
        }
    }
}