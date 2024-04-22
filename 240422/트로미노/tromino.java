import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max1 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!checkSquare(i, j)) continue;

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
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                // ㅡ자 블럭
                if(lineCheck(j, m)) {
                    max2 = Math.max(max2, map[i][j] + map[i][j+1] + map[i][j+2]);
                } 

                // |자 블럭
                if(lineCheck(i, n)) {
                    max2 = Math.max(max2, map[i][j] + map[i+1][j] + map[i+2][j]);
                }
            }
        }
        
        System.out.println(Math.max(max1, max2));
    }

    public static boolean lineCheck(int x, int l) {
        if(x < 0 || x+1 < 0 || x+2 < 0 || x >= l || x+1 >= l || x+2 >= l) {
            return false;
        }
        return true;
    }

    public static boolean checkSquare(int i, int j) {
        if(i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }else if(i+1 < 0 || i+1 >= n || j+1 < 0 || j+1 >= m) {
            return false;
        }
        return true;
    }
}