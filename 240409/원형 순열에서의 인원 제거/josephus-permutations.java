import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            queue.add(i);
        }

        int i=1;
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()) {
            if(i == k) {
                sb.append(queue.poll()+" ");
                i = 1;
            }else {
                queue.add(queue.poll());
                i++;
            }
        }
        System.out.println(sb);
    }
}