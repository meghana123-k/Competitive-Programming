import java.util.Scanner;


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Insertion {
    public static Node insertRec(Node root, int value) {
        if(root == null) {
            return new Node(value);
        }

        if(value <= root.data) {
            root.left = insertRec(root.left, value);
        } else if(value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    public static Node insertion(int a[]) {
        
        Node root = null;
        for(int value : a) {
            root = insertRec(root, value);
        }
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null)  return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Node root = insertion(a);
        inOrder(root);
    }
}