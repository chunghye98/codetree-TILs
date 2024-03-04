import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int before = -1;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(i == 0 || before == x) {
                count++;
                before = x;
                max = Math.max(max, count);
            }else {
                count++;
                max = Math.max(max, count);
                count = 0;
                before = x;
            }
            
        }
        System.out.println(max);
    }
}