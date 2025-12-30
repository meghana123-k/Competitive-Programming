import java.util.*;

class ReverseNum {
	public static int helper(int n, int rev) {
		if(n == 0) return rev;
		return helper(n/10, rev*10+(n%10));
	}
	public static void main(String... args) {
		int num = 123456789;
		int res = helper(num, 0);
		System.out.println(res);
	}
}