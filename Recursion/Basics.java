import java.util.Scanner;

public class Basics {
  public static void fun1(int i, int sum) {
    if(i < 1) {
      System.out.println(sum);
      return ;
    }
    fun1(i-1, sum + i);
  }
  public static int fun2(int n) {
    if(n == 0) return 0;
    return n + fun2(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fun1(n, 0);
    System.out.println(fun2(n));
  }
}
