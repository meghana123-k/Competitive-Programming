import java.util.Scanner;

public class PrintPattern {
    public static void helper(int r, int c, int n) {
        if(r == n) return;
        if(r >= c) {
            helper(r, c + 1, n);
            System.out.print("* ");
        } else {
            helper(r+1, 0, n);
            System.out.println();
        }
    }
    public static void triangle(int r, int c, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public  static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n, 0, n);
        helper(0, 0, n);
    }
}
