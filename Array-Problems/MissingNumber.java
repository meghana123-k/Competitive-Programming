import java.util.*;

public class MissingNumber {
    public static int missingNumber(int[] num) {
        int n = num.length;
        boolean miss[] = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (num[i] <= n && num[i] >= 0) {
                miss[num[i]] = true;
            }
        }
        for (int i = 0; i < miss.length; i++) {
            if (!miss[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing number is: ");
        System.out.println(missingNumber(arr));
    }
}
