import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(int i=1; i<=n; i++) {
            String str = br.readLine();
            map1.put(i, str);
            map2.put(str, i);
        }

        for(int i=1; i<=m; i++) {
            String key = br.readLine();
            try {
                System.out.println(map1.get(Integer.parseInt(key)));
            }catch(Exception e) {
                System.out.println(map2.get(key));
            }
        }
    }
}