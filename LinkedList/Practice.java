class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Practice {
    public static void main(String[] args) {
        int a[] = {5, 4, 6, 7 ,1};
        Node n = new Node(a[0]);
        Node head = n;
        for (int i = 1; i < a.length; i++) {
            Node t = new Node(a[i]);
            n.next = t;
            n = n.next;
        }
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
