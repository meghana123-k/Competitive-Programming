import java.util.*;

public class CountDigits {
    public static int divisionBy10(int n) {
        int cnt = 0;
        while(n != 0) {
            cnt++;
            n /= 10;
        }
        return cnt;
    }
    public static int intToString(int n) {
        String st = Integer.toString(Math.abs(n));
        return st.length();
    }
    public static int log10(int n) {
        return (n == 0) ? 0 : (int) (Math.log10(n))+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("--Converting the integer into string Approach--"); // Tc: O(log(n)) and Sc: O(log(n))
        System.out.println("Count of digits of "+n+" is: "+intToString(n));

        System.out.println("--Division by 10 Approach--"); // TC: O(log(n)) and Sc: O(1)
        System.out.println("Count of digits of "+n+" is: "+divisionBy10(n));
        
        System.out.println("--Logarithm Approach--"); // TC: O(1) and Sc: O(1)
        System.out.println("Count of digits of "+n+" is: "+log10(n));
    }
}
