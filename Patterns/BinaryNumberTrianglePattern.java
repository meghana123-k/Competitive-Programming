import java.util.*;
public class BinaryNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                int p = (i+j) % 2 == 0 ? 1 : 0;
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
