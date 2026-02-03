import java.util.*;

class LOLPalindrome {
    public static int check(String s, int start, int end) {

        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, check(str, i, i));
            max = Math.max(max, check(str, i, i+1));
        }

        System.out.println(max);
    }
}
