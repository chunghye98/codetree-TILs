import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-2; j++) {
                max = Math.max(max, map[i][j] + map[i][j+1]+map[i][j+2]);
            }
        }
        System.out.println(max);
    }
}