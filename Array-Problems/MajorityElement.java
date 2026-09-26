import java.util.HashMap;

public class MajorityElement {
    public static void betterApproach(int[] a) {
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
    public  static void optimalApproach(int[] a) {
        int cand = 0;
        int count = 0;
        for(int num: a) {
            if(count == 0) {
                cand = num;
                count++;
            }
            else if(cand == num) {
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println(cand);
    }
    public static void main(String[] args) {
        int a[] = { 2, 2, 1, 1, 1, 2, 2 };
        betterApproach(a);
        optimalApproach(a);
    }
}
