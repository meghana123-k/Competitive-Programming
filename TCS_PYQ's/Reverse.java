
public class Reverse {

    public static void main(String[] args) {
        if(args.length != 1 || args[0] == null) {
            System.out.println("Invalid input");
            return;
        }
        char[] ch = args[0].trim().toCharArray();

        int left = 0, right = ch.length-1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(ch));

    }
}