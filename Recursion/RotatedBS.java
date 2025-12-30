import java.util.Arrays;
import java.util.Scanner;

class RotatedBS {
    public static int helper(int[] a, int start, int end, int k) {
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(a[mid] == k) return mid;
        if(a[mid] > k) return  helper(a, start, mid-1, k);
        return helper(a, mid+1, end, k);

    }
    public  static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter "+i+" : ");
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(a);
        System.out.println(helper(a, 0, a.length-1, k));
    }
}
