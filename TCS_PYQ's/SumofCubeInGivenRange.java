import java.io.*;

public class SumofCubeInGivenRange {
    public static long MOD = 1000000007;

    public static long sumCube(long num) {
        long sum = (num * (num + 1)) / 2;
        return (sum * sum) % MOD;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().trim().split(" ");
        long n = Long.parseLong(input[0]);
        long m = Long.parseLong(input[1]);
        long cube = sumCube(m) - sumCube(n - 1);
        System.out.println(cube);
    }
}
