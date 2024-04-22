import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max1 = Integer.MIN_VALUE;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<m-1; j++) {
                // 반대 ㄴ 자 블럭
                max1 = Math.max(max1, map[i][j+1] + map[i+1][j] + map[i+1][j+1]);

                // ㄴ자 블럭
                max1 = Math.max(max1, map[i][j] + map[i+1][j] + map[i+1][j+1]);

                // 반대 ㄱ자 블럭
                max1 = Math.max(max1, map[i][j] + map[i][j+1] + map[i+1][j]);

                // ㄱ자 블럭
                max1 = Math.max(max1, map[i][j] + map[i][j+1] + map[i+1][j+1]);
            }
        }

        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<n-2; i++) {
            for(int j=0; j<m-2; j++) {
                // ㅡ자 블럭
                max2 = Math.max(max2, map[i][j] + map[i][j+1] + map[i][j+2]);

                // |자 블럭
                max2 = Math.max(max2, map[i][j] + map[i+1][j] + map[i+2][j]);
            }
        }
        
        System.out.println(Math.max(max1, max2));
    }
}