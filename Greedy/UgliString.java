import java.util.*;

class UgliString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cash = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] ch = s.toCharArray();
        Deque<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(ch[i] == '0') {
                que.add(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(ch[i] == '1') {
                while (!que.isEmpty() && que.peek() <= i) {
                    que.poll();
                }
                if (!que.isEmpty() && a < b && cash >= a) {
                    int z = que.poll();
                    ch[z] = '1';
                    ch[i] = '0';
                    cash -= a;
                } else if (cash >= b) {
                    ch[i] = '0';
                    que.add(i);
                    cash -= b;
                } else {
                    break;
                }
            }
        }
        int num = Integer.parseInt(String.valueOf(ch), 2);
        System.out.println(num);

    }
}