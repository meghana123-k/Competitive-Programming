import java.util.List;

public class GenerateSubsetSum {
    static void helper(int arr[], List<Integer> ans, int sum, int idx) {
        if(idx < 0) {
            ans.add(sum);
            return;
        }
        helper(arr, ans, sum, idx - 1);
        helper(arr, ans, sum + arr[idx], idx - 1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3};
        List<Integer> ans = new java.util.ArrayList<>();
        helper(arr, ans, 0, arr.length-1);
        System.out.println(ans);
    }
}
