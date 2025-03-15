import java.util.Arrays;
import java.util.Scanner;

public class FindSmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] arr) {
        int res[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
            res[k++] = cnt;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result[] = smallerNumbersThanCurrent(a);
        System.out.println("The Result is: "+Arrays.toString(result));
    }
}
