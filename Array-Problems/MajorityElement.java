import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] = { 2, 2, 1, 1, 1, 2, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key: map.keySet()) {
            int val = map.get(key);
            if(val > a.length/2) {
                System.out.println(key);
            }
        }
    }
}
