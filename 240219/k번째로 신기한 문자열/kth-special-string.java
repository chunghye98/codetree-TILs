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

        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            String input = br.readLine();
            if(input.substring(0, t.length()).equals(t)) {
                arr[i] = input;
            }else{
                arr[i] = "zzzzzz";
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[k-1]);
    }
}