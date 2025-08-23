
class CountSetBits {
    public static void main(String[] args) {
        int n = 10;
        int cnt = 0;
        while (n != 0) {
            cnt += (n & 1);
            //System.out.println((n >> 1)+" ");
            n = (n >> 1);
        }
        System.out.println(cnt);
        int m = 10;
        int c = 0;
        while (n != 0) {
            n = (n & n-1);
            c += 1;
        }
        System.out.println(c);
    }
}
