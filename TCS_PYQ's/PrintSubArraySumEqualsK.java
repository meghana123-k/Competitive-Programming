import java.io.*;
import java.util.HashMap;

class PrintSubArraySumEqualsK {
    public static void helper(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a[i];
            if (currSum == k) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
            if (map.containsKey(currSum - k)) {
                int startIdx = map.get(currSum - k) + 1;
                for (int j = startIdx; j <= i; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputArray = br.readLine().trim().split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(inputArray[i]);
        }
        int k = Integer.parseInt(br.readLine());
        helper(a, n, k);
    }
}
