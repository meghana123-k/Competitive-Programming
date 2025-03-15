import java.util.*;

public class MinTimeToVisitAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int currX = points[i][0];
            int currY = points[i][1];
            int targetX = points[i + 1][0];
            int targetY = points[i + 1][1];

            ans += Math.max(Math.abs(targetX - currX), Math.abs(targetY - currY));
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements");
        int arr[][] = new int[n][2];
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The minimum time in seconds to visit all the points in the order given by points.");
        System.out.println(minTimeToVisitAllPoints(arr));
        sc.close();
    }
}
