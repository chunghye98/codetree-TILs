import java.io.*;
import java.util.*;

/*
n개의 숫자를 가지는 수열에서 m개의 특정 숫자가 수열에 몇 개 있는지 찾는 문제

1. HashMap 생성
2. n번을 돌면서 HashMap에 key를 넣고 value는 count값을 넣는다. 
3. 값을 출력한다. 
*/
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int key = Integer.parseInt(st.nextToken());
            
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
                continue;
            }
            map.put(key, 1);
        }

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int key = Integer.parseInt(st.nextToken());
            int count = map.getOrDefault(key, 0);
            sb.append(count+" ");
        }
        System.out.println(sb);
    }
}