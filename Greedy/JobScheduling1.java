import java.util.*;
class Jobs {
		int id, profit, deadline;
		Jobs(int id, int profit, int deadline) {
			this.id = id;
			this.profit = profit;
			this.deadline = deadline;
		}
}
class JobScheduling1 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of jobs: ");
		int n = sc.nextInt();
		Jobs[] jobs = new Jobs[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter deadline for job "+i+" id: ");
			int deadline = sc.nextInt();
			System.out.println("Enter Profit for job "+i+" id: ");
			int profit = sc.nextInt();
			jobs[i] = new Jobs(i, profit, deadline);
		}
		Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
		int totProfit = 0, maxDeadline = 0;
		for(Jobs job : jobs) {
			maxDeadline = Math.max(maxDeadline, job.deadline);
		}
		int[] filled = new int[maxDeadline+1];
		Arrays.fill(filled, -1);
		for(Jobs job : jobs) {
			for(int j = job.deadline; j > 0	; j--) {
				if(filled[j] == -1) {
					filled[j] = job.id;
					totProfit += job.profit;
					break;
				}
			}
		}
		System.out.println("Scheduled Jobs: ");
        for (int i = 0; i <= maxDeadline; i++) { 
			if(filled[i] != -1) {
				System.out.print(filled[i] + " ");
			}
        }
        System.out.println("\nTotal Profit: " + totProfit);
	}
}