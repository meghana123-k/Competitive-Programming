import java.util.Scanner;

public class GCDBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int gcd = 1;
        for(int i = Math.min(a, b); i >= 1; i--) {
            if(a%i == 0 && b%i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD = "+gcd);
    }   
}
