import java.util.HashMap;
import java.util.Scanner;

public class FraudDetection {
    public static void main(String[] args) {
        /*
         * Find duplicate or fraud transactions
         * Given transactions in the following format
         * Sender receiver amount timestamp
         * as a single string
         * A transaction is fraud if it already exists and time difference is less than
         * 60 seconds
         * If you found fraud transaction print it
         * I used map
         * Sender receiver amount is key
         * Timestamp is value
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        boolean found = false;
        for (int i = 0; i < t; i++) {
            String sender = sc.next();
            String receiver = sc.next();
            int amount = sc.nextInt();
            int timestamp = sc.nextInt();
            String key = sender + " " + receiver + " " + amount;
            if (map.containsKey(key)) {
                int prevTimestamp = map.get(key);
                if (timestamp - prevTimestamp < 60) {
                    System.out.println("Fraud transaction: " + key
                            + " at timestamp " + timestamp
                    );
                    found = true;
                }
            }
            map.put(key, timestamp);
        }
        if(!found) {
            System.out.println("No fraud transactions found");
        }
        sc.close();
    }
}
