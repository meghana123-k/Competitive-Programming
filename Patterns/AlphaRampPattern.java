import java.util.*;

public class AlphaRampPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
    }
}