import java.util.*;

class CountDigits {
	public static int helper(int n, int cnt) {
		if(n == 0) return cnt;
		return helper(n/10, cnt+1);
	}
	public static void main(String... args) {
		int num = 123456789;
		int res = helper(num, 0);
		System.out.println(res);
	}
}