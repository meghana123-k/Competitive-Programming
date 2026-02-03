import java.util.Scanner;

public class ArrayGeneration {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        for(int i = 1; i <= n/2; i++) {
            a[2*i] = a[i];
            if(2*i+1 <= n) {
                a[2*i+1] = a[i] + a[i+1];
            }
        }
        int max = 0;
        for (int i = 0; i <= n; i++) {
            max = Math.max(a[i], max);
        }
        System.out.println(max);
    }
}
