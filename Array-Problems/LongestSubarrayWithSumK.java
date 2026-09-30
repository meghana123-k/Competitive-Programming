import java.util.*;;
public class LongestSubarrayWithSumK {
    public static void sliding(int[] a, int k) {
        int l = 0, r = 0;
        int sum = 0, maxLen = 0;
        while (r < a.length) {
            sum += a[r];
            while (l <= r && sum > k) {
                sum -= a[l];
                l++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
    public static void hashMap(int[] arr, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans = Math.max(ans, i - map.get(sum - k));
            }
            map.putIfAbsent(sum, i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // int[] a = {10, 5, 2, 7, 1, 9};
        // int[] a = { 1, 2, 3, 4, 5 };
        // int[] a = { 12, 4, 6, 8 };
        int[] a = { 5, 1, 2, 8 };

        // int k = 15;
        // int k = 9;
        // int k = 5;
        int k = 8;
        sliding(a, k);
        hashMap(a, k);
        
    }
}
