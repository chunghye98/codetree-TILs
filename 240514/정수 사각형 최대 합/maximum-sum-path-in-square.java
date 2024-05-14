import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[101][101];
        StringTokenizer st;
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[101][101];
        dp[1][1] = map[1][1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                // 오른쪽 이동
                int now = dp[i][j];
                int right = map[i][j+1];
                if(dp[i][j+1] < now + right) {
                    dp[i][j+1] = now + right;
                }
                
                // 밑으로 이동
                int down = map[i+1][j];
                if(dp[i+1][j] < now + down) {
                    dp[i+1][j] = now + down;
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}