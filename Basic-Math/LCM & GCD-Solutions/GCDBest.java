import java.util.Scanner;

public class GCDBest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        // To find the GCD of n1 and n2 where n1 > n2
        int n1 = Math.max(a, b), n2 = Math.min(a,b);
        // Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
        // Once one of them becomes 0, the other number is the GCD of the original numbers.
        while(n1 != 0) {
            n2 = Math.min(n1, n2);
            n1 = Math.abs(n1-n2);
        }       
        System.out.println("GCD = "+n2);
    }   
}
