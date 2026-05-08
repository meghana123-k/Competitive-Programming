package CodeForces;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int threshold = scores[k - 1];
        int count = 0;
        for (int score : scores) {
            if (score >= threshold && score > 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
