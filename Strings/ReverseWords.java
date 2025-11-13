
public class ReverseWords {
    public static void main(String[] args) {
        String str = "         Ram is a good boy       ";
        String s[] = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String i : s) {
            StringBuilder rev = new StringBuilder(i);
            String r = rev.reverse().toString();
            sb.append(r).append(" ");
        }
        System.out.println(sb.toString());
    }
}
