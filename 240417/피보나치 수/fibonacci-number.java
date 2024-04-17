import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}