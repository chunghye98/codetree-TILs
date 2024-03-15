import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int value = -1;

            switch(command) {
                case "push_back" :
                    value = Integer.parseInt(st.nextToken());
                    list.add(value);
                    break;
                case "pop_back" :
                    list.remove(list.size()-1);
                    break;
                case "size" :
                    System.out.println(list.size());
                    break;
                case "get" :
                    value = Integer.parseInt(st.nextToken());
                    System.out.println(list.get(value-1));
                    break;
            }

        }
    }
}