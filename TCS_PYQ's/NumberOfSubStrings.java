import java.util.Scanner;

public class NumberOfSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                cnt++;
            } else {
                ans += (cnt * (cnt+1))/2;
                cnt = 0;
            }
        }
        if(str.charAt(str.length()-1) == '1') {
            ans += (cnt * (cnt+1))/2;
        }
        System.out.println(ans);
        sc.close();
    }
}
