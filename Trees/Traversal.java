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
class Traversal {
    public static Node insertBST(Node root, int data) {
        if(root == null) return new Node(data);

        if(data <= root.data) {
            root.left = insertBST(root.left, data);
        } else if(data > root.data) {
            root.right = insertBST(root.right, data);
        }
        return root;
    }
    public static Node insertion(int a[]) {
        Node root = null;
        for(int value:a) {
            root = insertBST(root, value);
        }
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void preOrder(Node root) {
        if(root == null) return ;
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if(root == null) return ;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
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
        System.out.println("----------Preorder Traversal---------");
        preOrder(root);
        System.out.println();
        System.out.println("----------Inorder Traversal---------");
        inOrder(root);
        System.out.println();
        System.out.println("----------Postorder Traversal---------");
        postOrder(root);
    }
}
