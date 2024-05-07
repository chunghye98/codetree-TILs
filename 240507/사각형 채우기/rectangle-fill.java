import java.io.*;
import java.util.*;

// n: 1 -> 1
// n: 2 -> 2
// n: 3 -> 3
// n: 4 -> 5
// dp[n] = dp[n-1] + dp[n-2];

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}