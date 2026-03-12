import java.io.BufferedReader;
class Items {
    int id;
    String name;
    int quantity;
    int price;
    public Items(int id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
public class SellingItems {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Items[] items = new Items[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().trim().split(" ");
            items[i] = new Items(i, input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]));
        }
        int sum = 0;
        int max = 0;
        int id1 = 0;
        for(int i = 0; i < items.length; i++) {
            int x = items[i].price * items[i].quantity;
            if(max <= x) {
                max = x;
                id1 = items[i].id;
            }
            sum += (x);
        }
        int avg = sum / n;
        System.out.println("Sum = "+sum+"\nAverage: "+avg);
        String item = "";
        for (int i = 0; i < items.length; i++) {
            if(id1 == items[i].id) {
                item = items[i].name;
                break;
            }
        }
        System.out.println("Item Name: "+item);
    }
}
