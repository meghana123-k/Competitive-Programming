import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxContiguousSubArray {
    public static int[] maxOfSubarrays(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int res[] = new int[arr.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        res[0] = arr[dq.peekFirst()];
        for (int i = k; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
            res[i - k + 1] = arr[dq.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        System.out.println(Arrays.toString(maxOfSubarrays(arr, k)));
        // [3, 3, 5, 5, 6, 7]

        // System.out.println(Arrays.toString(minOfSubarrays(arr, k)));
        // [1, -1, -3, -3, 3, 3]
    }
}
