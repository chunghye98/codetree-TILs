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
            if(map.get(key) != null) {
                map.put(key, map.get(key)+1);
                continue;
            }
            map.put(key, 1);
        }
        
        // 2. map 돌면서 value 누적해서 출력
        int sum = 0;
        for(int key : map.keySet()) {
            if(map.get(k-key) == 1) {
                sum += map.get(key);
            }
        }
        sum /= 2;

        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                for(int i=map.get(key)-1 ; i>=0; i--) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}