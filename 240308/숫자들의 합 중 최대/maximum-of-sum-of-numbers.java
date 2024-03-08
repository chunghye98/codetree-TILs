import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;
        for(int i=x; i<=y; i++) {
            int sum = 0;
            int num = i;
            while(true) {
                if(num < 10) {
                    sum += num;
                    break;
                }
                sum += num % 10;
                num /= 10;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}