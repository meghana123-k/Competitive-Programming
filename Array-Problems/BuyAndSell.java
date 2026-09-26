public class BuyAndSell {
    public static void main(String[] args) {
        int[] a = { 7, 1, 5, 3, 6, 4 };
        int cheapPrice = a[0], ans = 0;
        for(int num : a) {
            if(num < cheapPrice) {
                cheapPrice = num;
            }
            ans = Math.max(ans, num - cheapPrice);
        }
        System.out.println(ans);
    }
}
