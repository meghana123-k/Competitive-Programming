import java.util.*;

class NoOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even = 1; // empty prefix
        int odd = 0;
        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            prefixSum += x;

            if (prefixSum % 2 == 0) {
                count += odd;
                even++;
            } else {
                count += even;
                odd++;
            }
        }

        System.out.println(count);
    }
}
