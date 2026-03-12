import java.util.*;
class PrintSubSequenceWithGiveSum {
    public static void helper(int[] a, int idx, int target, int sum, List<Integer> ar) {
        if(idx < 0) {
            if(sum == target) {
                System.out.println(ar);
            }
            return;
        }
        if(sum <= target) {
            ar.add(a[idx]);
            sum += a[idx];
            // System.out.println(ar+" "+sum);
            helper(a, idx - 1, target, sum, ar);
            sum -= a[idx];
            ar.remove(ar.size()-1);
        }
        helper(a, idx - 1, target, sum, ar);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        helper(a, a.length-1, sum, 0, new ArrayList<>());

        sc.close();
    }
    
}