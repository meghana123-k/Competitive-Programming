import java.util.*;;

public class SubArraySumK {
    public static void hashMapSol(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, len = 0;
        map.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum - k)) {
                len += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int k = 2;
        // int[] a = { 1, -1, 1, -1 };
        // int k = 0;
        // int[] a = { 0, 0, 0 };
        // int k = 0;
        // int[] a = { 5, 2, 7 };
        // int k = 7;
        // int[] a = { 1, 2, 4, 5 };
        // int k = 10;
        // int[] a = { -1, -2, -3, 4 };
        // int k = -3;
        // int[] a = { 3, 4, 7, 2, -3, 1, 4, 2 };
        // int k = 7;
        // int[] a = { 1, 2, 1, 2, 1 };
        // int k = 3;
        hashMapSol(a, k);
    }
}
