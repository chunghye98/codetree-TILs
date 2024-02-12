import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = solve(n);
        System.out.println(result);
    }

    public static int solve(int n){
        int result = 0;
        for(int i=1; i<=n; i++) {
            result += i;
        }

        return result / 10;
    }
}