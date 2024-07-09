import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        inputs = br.readLine().split(" ");
        int[] input = new int[n];
        for(int i=0; i<n; i++) {
            input[i] = Integer.parseInt(inputs[i]);
        }

        // 2. 입력으로 주어진 수의 갯수를 value로 넣는다.
        // 3. 합쳐서 k가 되는 수가 있다면 해당 수의 value를 result에 누적한다.
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0; i<n; i++) {
            int key = input[i];

            if(map.containsKey(k-key)){
                result += map.get(k-key);
            }

            if(map.get(key) != null) {
                map.put(key, map.get(key)+1);
                continue;
            }
            map.put(key, 1);
        }
        System.out.println(result);
    }
}