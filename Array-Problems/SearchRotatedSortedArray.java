import java.util.Scanner;

public class SearchRotatedSortedArray {
    public static int search(int[] a, int target) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(a[mid] == target) return mid;
            // 4 5 6 7 0 1 2
            if(a[low] <= a[mid]) {
                if(a[low] <= target && target <= a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(a[high] <= target && target >= a[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements");
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("Enter " + n + " Elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("found "+t+" at index "+search(arr, t));
    }
}
