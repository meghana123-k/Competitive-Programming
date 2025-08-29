import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] a, int low, int high) {
        if(low >= high) return ;
        int mid = (low+ high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a, low, mid, high);
    }
    public static void merge(int[] a, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high) {
            if(a[left] <= a[right]) {
                temp.add(a[left++]);
            } else {
                temp.add(a[right++]);
            }
        }

        while(left <= mid) {
            temp.add(a[left++]);
        }
        while(right <= high) {
            temp.add(a[right++]);
        }
        for(int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }
    }
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4, 1, 5, 6, 2, 4};
        mergeSort(a, 0, a.length-1);
        for(int num : a) {
            System.out.print(num + " ");
        }
    }
}
