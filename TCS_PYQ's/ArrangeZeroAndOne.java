import java.util.*;;
public class ArrangeZeroAndOne {
    public static void main(String[] args) {
        int[] ar = {0, 1, 0, 0, 0};
        int low = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == 0) {
                int temp = ar[i];
                ar[i] = ar[low];
                ar[low] = temp;
                low++;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
