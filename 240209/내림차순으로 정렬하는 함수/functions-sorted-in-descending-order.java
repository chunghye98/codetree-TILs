import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<n; i++) {
            result.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(result, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(Integer value : result) {
            sb.append(value+" ");
        }
        System.out.println(sb);
    }
}