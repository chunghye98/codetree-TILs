import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0}; // 상우하좌
    static int[] dx = {0, 1, 0, -1};
    static int n;
    static int m;
    static int[][] homes;
    static boolean[][] visit;

    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        homes = new int[n][m];
        visit = new boolean[n][m];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                homes[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxArea = Integer.MIN_VALUE;
        int k = -1;
        for(int l=1; l<=100; l++) {
            int count = 0; 
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(!visit[i][j] && homes[i][j] > l) { 
                        visit[i][j] = true; 
                        dfs(i, j, l);
                        count++;
                    }
                }
            }
            if(count > maxArea) {
                maxArea = count;
                k = l;
            }
            visit = new boolean[n][m]; 
        }

        System.out.println(k+" "+maxArea);
    }

    public static void dfs(int y, int x, int k) {
        for(int i=0; i<4; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];

            if(!isRange(nextY, nextX) || homes[nextY][nextX] <= k || visit[nextY][nextX]) {
                continue;
            }

            visit[nextY][nextX] = true;
            dfs(nextY, nextX, k);
        }
    }

    public static boolean isRange(int y, int x) {
        return y >= 0 && y < n && x >= 0 && x < m;
    }
}