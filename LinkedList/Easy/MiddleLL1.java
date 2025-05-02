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
  static int findLength(Node head) {
    Node temp = head;
    int cnt = 0;
    while (temp != null) {
      cnt++;
      temp = temp.next;
    }
    return cnt;
  }
  static int middle(Node head) {
    if(head == null) return 0;
    if(head.next == null) return head.data;
    int midValue = 0;
      Node temp = head;
      int midInd = findLength(head) / 2;
      while (midInd > 0) {
        temp = temp.next;
        midInd--;
      }
      midValue = temp.data;
    return midValue;
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
