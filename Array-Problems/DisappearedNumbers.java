import java.util.*;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        boolean vis[] = new boolean[n+1];
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i] <= n && arr[i] > 0) {
                vis[arr[i]] = true;
            }
        }
        for(int i = 1; i < vis.length; i++) {
            if(!vis[i]) {
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        List<Integer> result = findDisappearedNumbers(a);
        System.out.println(result.toString());
    }
}
