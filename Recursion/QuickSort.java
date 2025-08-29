public class QuickSort {
    public static void quickSort(int[] a, int low, int high) {
        if(low < high) {
            int pId = partition(a, low, high);
            quickSort(a, low, pId-1);
            quickSort(a, pId+1, high);
        }
    }
    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low, j = high;

        while(i < j) {

            while(a[i] <= pivot && i <= high-1) {
                i++;
            }
            while(a[j] > pivot && j >= low + 1) {
                j--;
            }
            if(i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[j];
        a[j] = a[low];
        a[low] = temp;
        return j;
    }
    public static void main(String[] args) {
        int[] a = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        quickSort(a, 0, a.length - 1);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
