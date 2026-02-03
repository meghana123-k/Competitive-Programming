import java.util.*;
class KSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt() * 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(k-- > 0) {
            int a = sc.nextInt();
            pq.add(a);
        }
        while(!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}