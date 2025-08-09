class CheckPalindrome {
    public static boolean checkPalindrome(String s, int i, int n) {
        if(i >= n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return checkPalindrome(s, i+1, n);
    }
    public static void main(String[] args) {
        String s[] = {"madam", "abccba", "hello", "hi", "hmmh", "112111"};

        for (String str : s) {
            System.out.print(checkPalindrome(str, 0, str.length())+" ");
        }

    }
}
