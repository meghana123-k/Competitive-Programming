import java.util.*;

class FindArraySorted {
	public static boolean helper(int[] a, int i) {
		if(i >= a.length-1) return true;
		if(a[i+1] < a[i]) return false;
		return helper(a, i+1);
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter "+i+" : ");
			a[i] = sc.nextInt();
 		}
		System.out.println(helper(a, 0));
	}
}