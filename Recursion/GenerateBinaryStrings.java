import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStrings {
    public static void gen(int idx, StringBuilder sb, int n, List<String> res) {
        if (idx == n) {
            String st = sb.toString();
            if(!st.contains("11")) {
                res.add(st);
            }
            return;
        }
        sb.append("0");
        gen(idx + 1, sb, n, res);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("1");
        gen(idx + 1, sb, n, res);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        int n = 3;
        gen(0, sb, n, res);
        System.out.println(res);

    }
}
