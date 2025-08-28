import java.util.*;
public class GenerateSubSet {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int c = (1 << n);
        for(int i = 0; i < c; i++) {
            ArrayList<Integer> ar = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if((i & (1L << j)) != 0) {
                    ar.add(nums[j]);
                }
            }
            res.add(ar);
        }
        System.out.println(res);
    }
}
