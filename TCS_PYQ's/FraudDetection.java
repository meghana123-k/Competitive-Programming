import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Transaction {
    String sender;
    String receiver;
    double amount;
    int timestamp;

    Transaction(String sender, String receiver, double amount, int timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}

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
        // HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        Transaction[] transactions = new Transaction[t];

        for (int i = 0; i < t; i++) {
            String parts[] = sc.nextLine().trim().split(" ");
            transactions[i] = new Transaction(parts[0], parts[1], Double.parseDouble(parts[1]),
                    Integer.parseInt(parts[2]));
        }
        HashMap<String, ArrayList<long[]>> map = new HashMap<>();
        for(int i = 0; i < t; i++) {
            String key = transactions[i].sender + transactions[i].receiver + transactions[i].amount;
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(new long[]{transactions[i].timestamp, i});
        }
        long fraud[] = new long[t];
        for(int i = 0; i < t; i++) {
            
        }
        sc.close();
    }
}
