import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        StringTokenizer st;
        for(int i=0; i<2; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            list.subList(a-1, b).clear();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()+"\n");
        for(int v : list) {
            sb.append(v+"\n");
        }
        System.out.println(sb);
    }
}