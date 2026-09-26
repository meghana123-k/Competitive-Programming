public class RangeSum {
    public  static int rangeSum(int[] a, int i, int j) {
        int[] pf = new int[a.length];
        pf[0] = a[0];
        for(int k = 1; k < a.length; k++) {
            pf[k] = pf[k-1] + a[k];
        }
        if(i == 0) {
            return pf[j];
        }
        return pf[j] - pf[i-1];
    }
    public static void main(String[] args) {
        int a[] = {2, 4, 1, 7, 3, 6};
        System.out.println(rangeSum(a, 1, 3));
        System.out.println(rangeSum(a, 2, 5));
        System.out.println(rangeSum(a, 1, 5));
    }
}
