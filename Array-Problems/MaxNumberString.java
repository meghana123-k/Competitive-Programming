import java.util.Scanner;

class MaxNumberString {
    public static int helper(String number, char digit) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == digit) {
                int num = Integer.parseInt(number.substring(0, i) + number.substring(i+1));
                max = Math.max(max, num);
            }
        }
        return max;
    }
    public  static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char digit = sc.next().charAt(0);
        System.out.println(helper(number, digit));
    }
}