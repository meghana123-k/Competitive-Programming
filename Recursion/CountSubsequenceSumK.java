import java.util.ArrayList;

public class CountSubsequenceSumK {
    public static int countSubsequence(int idx, int[] a, int n, int k, int sum) {
        if (idx == n) {
            if (sum == k) {
                return 1;
            } else {
                return 0;
            }
        }
        sum = sum + a[idx];
        int l = countSubsequence(idx + 1, a, n, k, sum);
        sum = sum - a[idx];
        int r = countSubsequence(idx + 1, a, n, k, sum);
        return l + r;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2,  1};
        int n = 3, k = 2;
        System.out.println(countSubsequence(0, a, n, k, 0));
    }
}
