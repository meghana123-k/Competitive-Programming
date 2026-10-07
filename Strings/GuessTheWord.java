/**
 * GuessTheWord
 */
class GuessTheWord {

    public static void main(String... args) {

        // String str = "Hello Good morning Welcome you";
        String str = "Go To Hell";

        String s[] = str.trim().split("\\s+");
        int max = 0;
        for (String word : s) {
            int len = word.length();
            if (len % 2 != 0) {
                max = Math.max(len, max);
            }
        }
        if (max == 0) {
            System.out.println("Better Luck Next Time!");
            return;
        }
        for (String word : s) {
            int len = word.length();
            if (max == len) {
                System.out.println(word);
                break;
            }
        }
    }
}