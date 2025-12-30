import java.util.*;

class SearchNumber {
	public static boolean helper(int[] a, int i, int k) {
		if(i >= a.length) return false;
		return a[i] == k || helper(a, i+1, k);
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter "+i+" : ");
			a[i] = sc.nextInt();
 		}
		int k = sc.nextInt();
		System.out.println(helper(a, 0, k));
	}
}