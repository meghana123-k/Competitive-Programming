import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            char[] ch = s[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s[i]);
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(String key : map.keySet()) {
            res.add(map.get(key));
        }
        System.out.println(res);
        
    }
}
