import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class MaxDiffBtwSmallAndLargeNum {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        String line[] = input.substring(1, input.length() - 1).trim().split(",");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String num : line) {
            arr.add(Integer.parseInt(num.trim()));
        }
        int smallest = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int val : arr) {
            smallest = Math.min(smallest, val);
            ans = Math.max(ans, val - smallest);
        }
        System.out.println(ans);
    }
}