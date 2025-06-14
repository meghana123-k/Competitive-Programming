import java.util.Scanner;

public class Basics {
  public static void fun(int i, int sum) {
    if(i < 1) {
      System.out.println(sum);
      return ;
    }
    fun(i-1, sum + i);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fun(n, 0);
  }
}
