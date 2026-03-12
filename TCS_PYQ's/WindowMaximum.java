import java.io.*;
import java.util.*;

public class WindowMaximum {

    public static long windowMax(long[] ar, long n, long k) {

        Deque<Integer> dq = new LinkedList<>();
        long sum = 0;

        for (int i = 0; i < ar.length; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && ar[dq.peekLast()] <= ar[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
            if (i >= k - 1) {
                sum = (sum + ar[dq.peekFirst()]) % 100000007;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long t = Long.parseLong(br.readLine().trim());
        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            long k = Long.parseLong(s[1]);
            String st[] = br.readLine().trim().split(" ");
            long ar[] = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Long.parseLong(st[i]);
            }
            long sum = windowMax(ar, n, k);
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}