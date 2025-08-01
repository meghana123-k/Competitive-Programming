import java.util.Scanner;

class SumOfNatural {
    public static void fun(int n, int sum) {
        if (n == 0) {
            System.out.print(sum);
            return;
        }
        fun(n - 1, sum + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n, 0);
        sc.close();
    }
}
