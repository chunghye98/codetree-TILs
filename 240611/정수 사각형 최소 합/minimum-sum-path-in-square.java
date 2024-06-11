import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] dp;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n][n];
        map = new int[n][n];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        init();
        for(int i=1; i<n; i++) {
            for(int j=n-2; j>=0; j--) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j+1]) + map[i][j];
            }
        }
        System.out.println(dp[n-1][0]);
    }

    public static void init() {
        dp[0][n-1] = map[0][n-1];

        for(int i=1; i<n; i++) {
            dp[i][n-1] = dp[i-1][n-1] + map[i][n-1];
        }

        for(int j=n-2; j>=0; j--) {
            dp[0][j] = dp[0][j+1] + map[0][j];
        }
    }
}