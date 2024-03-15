import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] inputs = br.readLine().split("");

        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(inputs[i]);
        }

        ListIterator<String> it = list.listIterator(list.size());

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();
            if(command.equals("L")) {
                if(it.hasPrevious())
                    it.previous();
            } else if(command.equals("R")) {
                if(it.hasNext())
                    it.next();
            } else if(command.equals("D")) {
                if(it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if(command.equals("P")) {
                String value = st.nextToken();
                it.add(value);
            }
        }
        // 출력:
        it = list.listIterator();
        while(it.hasNext())
            System.out.print(it.next());
    }
}