import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int value = -1;

            switch (command) {
                case "push_front" :
                    value = Integer.parseInt(st.nextToken());
                    queue.addFirst(value);
                    break;
                case "push_back" :
                    value = Integer.parseInt(st.nextToken());
                    queue.addLast(value);
                    break;
                case "pop_front" :
                    System.out.println(queue.pollFirst());
                    break;
                case "pop_back" :
                    System.out.println(queue.pollLast());
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if(queue.isEmpty()) {
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "front" :
                    System.out.println(queue.peekFirst());
                    break;
                case "back" :
                    System.out.println(queue.peekLast());
                    break;
            }
        }
    }
}