
public class FindSecondSmallest {
    public static void main(String[] args) {
        int a[] = { 2, 2, 2147483647};
        int min = Integer.MAX_VALUE, sec = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(min > a[i]) {
                sec = min;
                min = a[i];
            } else if(a[i] > min && a[i] < sec) {
                sec = a[i];
            }
        }
        System.out.println(min + " " +sec);
    }
}
