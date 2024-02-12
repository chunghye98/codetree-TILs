import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = (n * m) / gcd(n, m);
        System.out.println(result);
    }

    public static int gcd(int n, int m){
        if(m == 0) {
            return n;
        }

        return gcd(m, n%m);
    }

}