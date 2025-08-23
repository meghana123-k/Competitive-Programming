class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;
    DLLNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class DLL {
    public static void main(String[] args) {
        int ar[] = {45, 67, 89, 12, 41, 23};
        DLLNode nn = new DLLNode(ar[0]);
        DLLNode head = nn;
        for (int i = 1; i < ar.length; i++) {
            DLLNode t = new DLLNode(ar[i]);
            t.prev = nn;
            nn.next = t;
            t = t.next;
            nn = nn.next;
        }
        while (head != null) {
            System.out.println(head.data+" ");
            head = head.next;
        }
    }
}
