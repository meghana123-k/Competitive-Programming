import java.util.HashMap;
import java.util.Map;

class FindFrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 1, 4, 2, 3 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()) {
            System.out.println(key+ " "+ map.get(key));
        }
    }
}
