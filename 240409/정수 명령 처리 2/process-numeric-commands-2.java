import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push" :
                    int value = Integer.parseInt(st.nextToken());
                    queue.add(value);
                    break;
                case "front" :
                    System.out.println(queue.peek());
                    break;
                case "pop" :
                    System.out.println(queue.poll());
                    break;
                case "empty" :
                    if(queue.isEmpty()) {
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "size" : 
                    System.out.println(queue.size());
                    break;
            }
        }
    }
}