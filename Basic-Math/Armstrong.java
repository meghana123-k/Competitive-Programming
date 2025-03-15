import java.util.*;
public class Armstrong{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
		int n = sc.nextInt();
		String st = String.valueOf(n);
		int len = st.length();
		int res = 0;
		int temp = n;
		while(temp != 0) {
			int dig = temp % 10;
			res += Math.pow(dig, len);
			temp /= 10; 
		}
    // prints if true, if n == res ,else prints false
		System.out.println(n == res);
	}
}
