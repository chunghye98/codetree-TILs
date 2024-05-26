import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0}; // 상우하좌
    static int[] dx = {0, 1, 0, -1};
    static int n;
    static int[][] map;
    static boolean[][] visit;
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        count = 0;
        int result = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(visit[i][j]) {
                    continue;
                }
                dfs(i, j);
                if(count >= 4) {
                    result++;
                }
                max = Math.max(count, max);
                count = 0;
            }
        }

        System.out.println(result+" "+max);
    }

    public static void dfs(int y, int x) {
        for(int i=0; i<4; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];

            if(isRange(nextY, nextX) && !visit[nextY][nextX] && map[y][x] == map[nextY][nextX]) {
                count++;
                visit[nextY][nextX] = true;
                dfs(nextY, nextX);
            }
        }
    }

    public static boolean isRange(int y, int x) {
        return y >= 0 && y < n && x >= 0 && x < n;
    }
}