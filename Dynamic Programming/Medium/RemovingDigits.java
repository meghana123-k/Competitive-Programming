import java.util.Scanner;

public class RemovingDigits {
    public static long helperRec(long num) {
        if (num == 0)
            return 0;
        long max = findMaxDigit(num);
        // System.out.println(max);
        return 1 + helperRec(num - max);
    }
    public static long findMaxDigit(long num) {
        String n = String.valueOf(num);
        long max = 0;
        for(char ch: n.toCharArray()) {
            max = Math.max(ch-'0', max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long res = helperRec(num);
        System.out.println(res);
        sc.close();
    }
}
