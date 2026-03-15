import java.io.*;
import java.util.*;

class NumberOfPairOfShoes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        String line[] = br.readLine().trim().split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            map.put(line[i], map.getOrDefault(line[i], 0)+1);
        }
        int pairs = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            String opposite;
            String size = key.substring(0, key.length()-1);
            char side = key.charAt(key.length()-1);
            if(side == 'L') {
                opposite = size+"R";
            } else {
                opposite = size+"L";
            }
            if(map.containsKey(opposite)) {
                pairs += Math.min(value, map.get(opposite));
            }
        }
        System.out.println(pairs / 2);
    }
}
