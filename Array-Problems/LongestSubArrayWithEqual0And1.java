import java.util.*;;

class LongestSubArrayWithEqual0And1 {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1};
        int ans = findMaxLength(arr);
        System.out.println(ans);
    }
}
