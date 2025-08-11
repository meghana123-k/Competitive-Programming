import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

class FrontBackMiddle {
    public Deque<Integer> que;
    public FrontBackMiddle() {
        que = new LinkedList<>();
    }
    public void pushFront(int val) {
        que.addFirst(val);
        System.out.println(que);
    }
    public void pushBack(int val) {
        que.addLast(val);
        System.out.println(que);
    }
    public void pushMiddle(int val) {
        Stack<Integer> stk = new Stack<>();
        int cnt = 0;
        while(cnt < que.size()/2) {
            stk.push(que.pollFirst());
            cnt++;
        }
        que.addFirst(val);
        while (!stk.isEmpty()) {
            que.addFirst(stk.pop());
        }
        System.out.println(que);
    }
    public int popFront() {
        if(que.isEmpty()) return -1;
        return que.pollFirst();
    }
    public int popBack() {
        if(que.isEmpty()) return -1;
        return que.pollLast();
    }
    public int popMiddle() {
        if(que.isEmpty()) return -1;
        Stack<Integer> stk = new Stack<>();
        int cnt = 0;
        while(cnt < que.size()/2) {
            stk.push(que.pollFirst());
            cnt++;
        }
        int ans = que.pollFirst();
        while (!stk.isEmpty()) {
            que.addFirst(stk.pop());
        }
        return ans; 
    }
}
class FrontBackMiddleQueue {
    public static void main(String[] args) {
        FrontBackMiddle f = new FrontBackMiddle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test cases: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter n: ");
            int n = sc.nextInt();
            for(int i = 0; i < n/2; i++) {
                System.out.println("Enter operation - 1, 2, 3");
                int op = sc.nextInt();
                System.out.println("Enter value to add ");
                int val = sc.nextInt();
                if(op == 1) {
                    f.pushFront(val);
                } else if(op == 2) {
                    f.pushMiddle(val);
                } else if(op == 3) {
                    f.pushBack(val);
                }
            }
            for(int i = n/2; i < n; i++) {
                System.out.println("Enter op to perform poll");
                int op = sc.nextInt();
                if(op == 1) {
                    System.out.println("Pop Front: "+f.popFront());
                } else if (op == 2) {
                    System.out.println("Pop Middle: "+f.popMiddle());
                } else if (op == 3) {
                    System.out.println("Pop Back: "+f.popBack());
                }
            }
        }
    }    
}
