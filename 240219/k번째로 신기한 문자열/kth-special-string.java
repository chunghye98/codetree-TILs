import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        List<String> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            String input = br.readLine();

            if(input.size > t.length){
                continue;
            }

            if(input.substring(0, t.length()).equals(t)) {
                result.add(input);
            }
        }

        Collections.sort(result);

        System.out.println(result.get(k-1));
    }
}