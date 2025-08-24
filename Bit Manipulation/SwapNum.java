public class SwapNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a = a ^ b; // a = 5 ^ 6
        b = a ^ b; // b = (5 ^ 6) ^ 5 = 5
        a = a ^ b; // a = (5 ^ 6) ^ 5 = 6
        System.out.print(a + " "+ b);
    }
}
