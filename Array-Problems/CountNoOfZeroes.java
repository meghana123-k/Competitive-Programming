import java.util.Scanner;

public class CountNoOfZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int low = 0, high = n - 1;
        int ans = 0;
        while (low <= high) {
            int  mid = (low + high) / 2;
            if(a[mid] == 0) {
                ans += (mid - low) + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("No. Of zeroes: "+ans);
    }
}
