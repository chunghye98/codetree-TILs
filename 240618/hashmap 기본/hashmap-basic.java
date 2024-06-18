import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String operator = st.nextToken();
            int key = 0;
            int value = 0;

            switch(operator) {
                case "add" :
                    key = Integer.parseInt(st.nextToken());
                    value = Integer.parseInt(st.nextToken());
                    map.put(key, value);
                    break;
                case "find" :
                    key = Integer.parseInt(st.nextToken());
                    int x = map.getOrDefault(key, -1);
                    if(x == -1) {
                        System.out.println("None");
                    }else {
                        System.out.println(x);
                    }
                    break;
                case "remove" :
                    key = Integer.parseInt(st.nextToken());
                    map.remove(key);
                    break;
            }
        }
    }
}