import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] inputs = new int[3];
        for(int i=0; i<3; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputs);
        System.out.println(inputs[1]);
    }
}