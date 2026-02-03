import java.util.*;
class KthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(n-- > 0) {
            int a = sc.nextInt();
            pq.add(a);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        System.out.println(pq.peek());
    }
}