public class Kadane {
    public static void main(String[] args) {
        // int[] a = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        int[] a1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num: a1) {
            if(sum < 0) {sum = 0;}
            sum += num;
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
