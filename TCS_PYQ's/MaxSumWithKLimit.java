import java.util.Scanner;

public class MaxSumWithKLimit {
    public static int helper(int[]a, int tar, int sum, int idx) {
        if(sum > tar) return -1;
        if(idx < 0) return sum;
        int take = 0;
        if(sum <= tar) {
            take = helper(a, tar, sum + a[idx], idx-1);
        }
        int notTake = helper(a, tar, sum, idx-1);
        return Math.max(take, notTake);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.println(helper(a, t, 0, n-1));
        sc.close();
    }   
}
