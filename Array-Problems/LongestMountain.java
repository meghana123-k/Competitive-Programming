import java.util.*;

public class LongestMountain {

    public static int longestMountain(int[] arr, int n) {
        int ans = 0, i = 0;
        while (i < n) {
            int j = i;
            if (j + 1 < n && arr[j] < arr[j + 1]) {
                while (j + 1 < n && arr[j] < arr[j + 1])
                    j++;
                if (j + 1 < n && arr[j] > arr[j + 1]) {
                    while (j + 1 < n && arr[j] > arr[j + 1])
                        j++;
                    ans = Math.max(ans, j - i + 1);
                }
            }
            i = Math.max(j, i + 1);
        }
        return ans;
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
        System.out.println("The length of the longest mountain is "+longestMountain(a, n)); 
        sc.close();   
    }
}
