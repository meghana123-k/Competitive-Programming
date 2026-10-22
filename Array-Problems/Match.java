import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            int cnt = 0;
            
            res.add(cnt);
        }
        System.out.println(res);
        sc.close();
    }
}
