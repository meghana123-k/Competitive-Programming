import java.util.ArrayList;

public class GenerateSubsequence {
    public static void printSubsequence(int idx, ArrayList<Integer> res, int[] a, int n) {
        if (idx == n) {
            System.out.println(res);
            return;
        }
        res.add(a[idx]);
        printSubsequence(idx+1, res, a, n);
        res.removeLast();
        printSubsequence(idx+1, res, a, n);
    }

    public static void main(String[] args) {
        int a[] = { 3, 1, 2 };
        int n = 3;
        ArrayList<Integer> res = new ArrayList<>();
        printSubsequence(0, res, a, n);
    }
}
