import java.util.Scanner;

public class AlphaTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) (n + 64);
            for (int j = i; j >= 0; j--) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
