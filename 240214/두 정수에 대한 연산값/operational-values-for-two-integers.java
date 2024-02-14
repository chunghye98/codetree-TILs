import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(solve(a, b));
    }

    public static String solve(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if(a == max) {
            a += 25;
            b *= 2;
        }else {
            a *= 2;
            b += 25;
        }
        return a + " "+b;

    }
}