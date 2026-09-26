
public class MaxSumOfKElements {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int l = 0;
        int sum = 0;
        int max = 0;
        for(int r = 0; r < a.length; r++) {
            sum += a[r];
            if(r-l+1 == k) {
                max = Math.max(max, sum);
                sum -= a[l];
                l++;
            }
        }
        System.out.println(max);
    }
    
}