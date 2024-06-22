import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String key = br.readLine();
            int value = map.getOrDefault(key, 0);
            
            if(value == 0) {
                map.put(key, 1);
                continue;
            }
            map.put(key, value+1);
        }

        int max = Integer.MIN_VALUE;
        for(String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        System.out.println(max);
    }
}