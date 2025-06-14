public class MiddleLL {
  static class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  static Node createLL(int a[]) {
    Node head = new Node(a[0]);
    Node temp = head;
    for (int i = 1; i < a.length; i++) {
      Node newNode = new Node(a[i]);
      temp.next = newNode;
      temp = newNode;
    }
    return head;
  }
  static void printLL(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  
  static int middle(Node head) {
    if(head == null) return 0;
    if(head.next == null) return head.data;
    if(head.next.next == null) return head.next.data;
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.data;
    
  }
  public static void main(String[] args) {
    int arr1[] = {10, 20, 30};
    int arr2[] = {1, 2, 3, 40};
    Node head1 = createLL(arr1);
    Node head2 = createLL(arr2);
    printLL(head1);
    printLL(head2);
    int mid1 = middle(head1);
    int mid2 = middle(head2);
    System.out.println(mid1);
    System.out.println(mid2);
  }
}
