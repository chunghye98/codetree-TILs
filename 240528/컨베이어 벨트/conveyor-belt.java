import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        Deque<Integer> dq1 = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            dq1.add(Integer.parseInt(st.nextToken()));
        }

        Deque<Integer> dq2 = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            dq2.add(Integer.parseInt(st.nextToken()));
        }
        
        for(int i=0; i<t; i++) {
            dq1.addFirst(dq2.pollLast());
            dq2.addFirst(dq1.pollLast());
        }

        StringBuilder sb = new StringBuilder();
        while(!dq1.isEmpty()){
            sb.append(dq1.poll()+" ");
        }
        sb.append("\n");
        while(!dq2.isEmpty()){
            sb.append(dq2.poll()+" ");
        }
        System.out.println(sb);
    }
}