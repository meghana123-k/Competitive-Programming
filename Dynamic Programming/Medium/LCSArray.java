
import java.util.ArrayList;
import java.util.Scanner;

public class LCSArray {
    static ArrayList<Integer> r;

    public static int helperRec(int[] a, int[] b, int i, int j, ArrayList<Integer> curr) {
        if (i < 0 || j < 0) {
            if (curr.size() > r.size()) {
                r = new ArrayList<>(curr);
            }
            return 0;
        }
        int left = 0, right = 0;
        if (a[i] == b[j]) {
            curr.add(a[i]);
            int cnt = 1 + helperRec(a, b, i - 1, j - 1, curr);
            curr.remove(curr.size()-1);
            return cnt;
        } else {
            left = helperRec(a, b, i - 1, j, curr);
            right = helperRec(a, b, i, j - 1, curr);
            return Math.max(left, right);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        r = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        int res = helperRec(a, b, n - 1, m - 1, curr);
        System.out.println(r);
        System.out.println(res);
        sc.close();
    }
}
