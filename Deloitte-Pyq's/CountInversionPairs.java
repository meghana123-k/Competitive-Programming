import java.util.*;
class CountInversionPairs {
    public static int count(int[] a, int[] temp,int low, int high) {
        int inv = 0;
        if(low < high) {
            int mid = (low + high)/2;
            inv += count(a, temp, low, mid);
            inv += count(a, temp, mid+1, high);
            inv += merge(a, temp,low, mid, high);
        }
        return inv;
    }
    public static int merge(int[] a, int[] temp, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        int k = low;
        int inv = 0;

        while (i <= mid && j <= high) {
            if(a[i] <= a[j]) {
                temp[k++] = a[i];
                i++;
            } else {
                temp[k++] = a[j++];
                inv += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= high) {
            temp[k++] = a[j++];
        }
        for (i = low; i <= high; i++) {
            a[i] = temp[i];
        }
        return inv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        System.out.println(count(a, temp, 0, n-1));
    }
}