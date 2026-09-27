import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(char ch : s.toCharArray()) {
            
            f1[(int)(ch-'a')]++;
        }
        for(char ch : t.toCharArray()) {
            f2[(int)(ch-'a')]++;
        }
        boolean result = Arrays.equals(f1, f2);
        System.out.println(result);
    }
}
