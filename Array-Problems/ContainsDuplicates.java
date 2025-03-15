import java.util.*;

public class ContainsDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " Elements");
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        }
        for (int key : freq.keySet()) {
            int val = freq.get(key);
            if (val > 1) {
                System.out.print(key + " ");
            }
        }
    }
}