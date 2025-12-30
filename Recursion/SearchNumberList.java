import java.util.*;

class SearchNumberList {
	public static List<Integer> helper(int[] a, int i, int k, List<Integer> lst) {
		if (i >= a.length)
			return new ArrayList<>(lst);
		if (a[i] == k)
			lst.add(i);
		return helper(a, i + 1, k, lst);
	}

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + i + " : ");
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		List<Integer> lst = new ArrayList<>();

		System.out.println(helper(a, 0, k, lst));
	}
}