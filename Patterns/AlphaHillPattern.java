import java.util.*;

public class AlphaHillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
    
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print((char)ch+"");
                if(j < breakPoint) ch++;
                else ch--;
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
