import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] map;
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        dp = new int[n][n];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 초기값 설정
        initialize();
        
        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+map[i][j];
            }
        }
        System.out.println(dp[n-1][n-1]);
    }

    public static void initialize() {
        dp[0][0] = map[0][0];

        // 최좌측 초기값
        for(int i=1; i<n; i++) {
            dp[i][0] = dp[i-1][0] + map[i][0];
        }

        // 최상단 초기값
        for(int j=1; j<n; j++) {
            dp[0][j] = dp[0][j-1] + map[0][j];
        }
    }
}