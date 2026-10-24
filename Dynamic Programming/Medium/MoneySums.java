import java.util.Scanner;
import java.util.TreeSet;

public class MoneySums {
    static TreeSet<Integer> res;
    public static void helper(int[] a, int i, int sum) {
        if (i < 0) {
            res.add(sum);
            return;
        }
        helper(a, i - 1, sum + a[i]);
        helper(a, i - 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        res = new TreeSet<>();
        helper(a, n - 1, 0);
        res.pollFirst();
        System.out.println(res.size());
        for (int i : res) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
