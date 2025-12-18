import java.util.*;
class Time {
		int pos, start, end;
		Time(int pos, int start, int end) {
			this.pos = pos;
			this.start = start;
			this.end = end;
		}
}
class MeetingRooms {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Meetings: ");
		int n = sc.nextInt();
		Time[] time = new Time[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter start time of "+i+" : ");
			int start = sc.nextInt();
			System.out.println("Enter end time of "+i+" id: ");
			int end = sc.nextInt();
			time[i] = new Time(i, start, end);
		}
		int cnt = 1;
		Arrays.sort(time, (a, b) -> a.end - b.end);
		int freetime = time[0].end;
		List<Integer> order = new ArrayList<>();
		order.add(time[0].pos);
		for(int i = 1; i < n; i++) {
			if(time[i].start >= freetime) {
				cnt++;
				order.add(time[i].pos);
				freetime = time[i].end;
			}	
		}
		System.out.println("Scheduled Meeting Order ");
		System.out.println(order);
        System.out.println("\nTotal count: " + cnt);
	}
}