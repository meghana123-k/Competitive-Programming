import java.util.Scanner;

public class SummerArray {
    public static int helper(int[] a, int parity) {
        int pos = 0, swaps = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == parity) {
                swaps += Math.abs(i-pos);
                pos++;
            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " : ");
            a[i] = sc.nextInt();
        }
        int odd = helper(a, 1);
        int even = helper(a, 0);
        System.out.println(Math.max(odd, even));
    }
}
