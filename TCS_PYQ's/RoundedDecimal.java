class RoundedDecimal {
    public static void main(String... args) {
        double x = 12.34554;
        System.out.printf("%.2f\n", x);
        double n = Math.round(x * 100.0) / 100.0;
        System.out.println(n);
    }
}