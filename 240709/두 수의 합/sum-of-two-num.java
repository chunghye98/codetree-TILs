import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        Map<Integer, Integer> map = new HashMap<>();
        inputs = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            int key = Integer.parseInt(inputs[i]);
            map.put(key, 0);
        }

        // 2. map 돌면서 (k-key)가 null이 아니면 value+1
        for(int key : map.keySet()) {
            if(map.get(k-key) != null) {
                map.put(key, map.get(key)+1);
            }
        }
        
        // 3. map 돌면서 value 누적해서 출력
        int sum = 0;
        for(int key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println(sum/2);
    }
}