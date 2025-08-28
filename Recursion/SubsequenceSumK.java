import java.util.ArrayList;

public class SubsequenceSumK {
    public static void subsequenceSumk(int idx, ArrayList<Integer> ar, int[] a, int n, int k, int sum) {
        if(idx == n) {
            if(sum == k) {
                System.out.println(ar);
            }
            return ;
        }
        ar.add(a[idx]);
        sum = sum+a[idx];
        subsequenceSumk(idx+1, ar, a, n, k, sum);
        sum = sum-a[idx];
        ar.removeLast();
        subsequenceSumk(idx+1, ar, a, n, k, sum);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int a[] = {1, 2, 1};
        int n = 3, k = 3;
        subsequenceSumk(0, ar, a, n, k, 0);
    }
}
