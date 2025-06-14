public class BasicOperationsLL {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static void printLL(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  static boolean Search(Node head, int k) {
    if (head == null)
      return false;
    Node temp = head;
    while (temp != null) {
      if (temp.data == k) {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  static Node deleteAny(Node head, int k) {
    if (head == null || head.next == null)
      return null;

    if (k == 1) {
      Node temp = head;
      temp = temp.next;
      return temp;
    }
    int cnt = 0;
    Node prev = null;
    Node temp = head;
    while (temp != null && cnt != k) {
      cnt++;
      if (cnt == k) {
        prev.next = prev.next.next;
        break;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  static Node deleteValue(Node head, int value) {
    if (head == null || head.next == null)
      return null;

    if (head.data == value) {
      Node temp = head;
      temp = temp.next;
      return temp;
    }
    Node prev = null;
    Node temp = head;
    while (temp != null) {
      if (temp.data == value) {
        prev.next = prev.next.next;
        break;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  static Node insertFirst(Node head, int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    return newNode;
  }

  static Node insertLast(Node head, int data) {
    if (head == null)
      return new Node(data);
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node newNode = new Node(data);
    temp.next = newNode;
    return head;
  }

  static Node insertAny(Node head, int val, int k) {
    if (head == null) {
      if (k == 1) {
        Node temp = head;
        Node newNode = new Node(val);
        newNode.next = temp;
        return newNode;
      } else {
        return null;
      }
    }
    if (k == 1) {
      Node temp = head;
      Node newNode = new Node(val);
      newNode.next = temp;
      return newNode;
    }
    Node temp = head;
    int cnt = 0;
    while (temp != null) {
      cnt++;
      if (cnt == k - 1) {
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
      }
      temp = temp.next;
    }
    return head;
  }

  static Node insertValue(Node head, int val, int x) {
    if (head == null)
      return null;
    if (head.data == val) {
      return new Node(x);

    }
    Node temp = head;
    while (temp.next != null) {
      if (temp.next.data == val) {
        Node newNode = new Node(x);
        newNode.next = temp.next;
        temp.next = newNode;
        break;
      }
      temp = temp.next;
    }
    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 2, 1 };
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    printLL(head);
    System.out.println(Search(head, 10));
    Node delhead = deleteAny(head, 1);
    printLL(delhead);
    System.out.println();
    Node delhead1 = deleteValue(head, 2);
    printLL(delhead1);
    System.out.println();
    Node head2 = insertFirst(head, 100);
    printLL(head2);
    Node head3 = insertLast(head, 200);
    printLL(head3);
    Node head4 = insertAny(head, 300, 6);
    printLL(head4);
    Node head5 = insertValue(head, 300, 600);
    printLL(head5);
  }
}
