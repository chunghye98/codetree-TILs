import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int result = 0;
        for(int i=x; i<=y; i++) {
            char[] numStr = String.valueOf(i).toCharArray();
            boolean flag = true;
            for(int j=0; j<numStr.length / 2; j++) {
                if(numStr[j] != numStr[numStr.length - 1 - j]) {
                    flag = false;
                }
            }
            if(flag) {
                result++;
            }
        }
        System.out.println(result);
    }
}