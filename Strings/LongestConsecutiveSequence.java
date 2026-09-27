import java.util.*;;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] ar = { 100, 4, 200, 1, 3, 2 };

        HashSet<Integer> set = new HashSet<>();
        for (int num : ar) {
            set.add(num);
        }
        int maxLen = 0;
        for (int i = 0; i < ar.length; i++) {
            if (!set.contains(ar[i] - 1)) {
                int count = 1;
                int curr = ar[i];
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        System.out.println("Maximum Length: "+maxLen);
    }
}
