import java.util.Scanner;

class BubbleSort {
    public static void  helper(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for(int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j + 1]) {
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if(!flag) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
//    public static void bubbleSort(int[] a, int c, int r, int n) {
//        if(r == 0) return;
//        if(c < r) {
//            if(a[c] > a[c+1]) {
//                int temp = a[c];
//                a[c] = a[c+1];
//                a[c+1] = temp;
//            }
//            bubbleSort(a, c+1, r, n);
//        } else {
//            bubbleSort(a, 0, r, n);
//        }
//    }
//    public static  void StringPrinting()
    public  static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " : ");
            a[i] = sc.nextInt();
        }
        helper(a, n);
//        bubbleSort(a, 0, n);
    }
}
