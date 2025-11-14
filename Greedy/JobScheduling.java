import java.util.Scanner;

class JobScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of jobs: ");
        int n = sc.nextInt();
        int jobs[][] = new int[n][3];
        System.out.println("Enter job id, deadline and profit respectively: ");
        for (int i = 0; i < n; i++) {   
            jobs[i][0] = sc.nextInt(); // job id
            jobs[i][1] = sc.nextInt(); // deadline
            jobs[i][2] = sc.nextInt(); // profit
        }
        // Sort jobs by profit in descending order
        java.util.Arrays.sort(jobs, (a, b) -> b[2] - a[2]); 
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            if (jobs[i][1] > maxDeadline) {
                maxDeadline = jobs[i][1];
            }
        }
        int slot[] = new int[maxDeadline];
        boolean filled[] = new boolean[maxDeadline];
        int totalProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(maxDeadline, jobs[i][1]) - 1; j >= 0; j--) {
                if (!filled[j]) {
                    filled[j] = true;
                    slot[j] = jobs[i][0];
                    totalProfit += jobs[i][2];
                    break;
                }
            }
        }
        System.out.println("Scheduled Jobs: ");
        for (int i = 0; i < maxDeadline; i++) { 
            if (filled[i]) {
                System.out.print(slot[i] + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }
}
