import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a <= 11 && b <= 11 && c < 11) {
            System.out.println(-1);
            return;
        }

        int result = (a * 24 * 60 + b * 60 + c) - (11 * 24 * 60 + 11 * 60 + 11);
        System.out.println(result);
    }
}