import java.io.*;
import java.util.*; 

public class Main {

    static int[] dx = {0, 1}; // 하, 우
    static int[] dy = {1, 0};
    static int n;
    static int m;
    static int[][] map;
    static int[][] result;
    static boolean[][] visit;

    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        result = new int[n][m];
        visit = new boolean[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. dfs
        result[0][0] = 1;
        visit[0][0] = true;
        dfs(0, 0);

        // 3. 출력
        System.out.println(result[n-1][m-1]);
    }

    public static void dfs(int y, int x) {
        for(int i=0; i<2; i++) {
            int nextY = dy[i] + y;
            int nextX = dx[i] + x;

            if(isRange(nextY, nextX) && !visit[nextY][nextX] && map[nextY][nextX] == 0) {
                result[nextY][nextX] = result[y][x] + 1;
                visit[nextY][nextX] = true;
                dfs(nextY, nextX);
            }
        }
    }

    public static boolean isRange(int y, int x) {
        return y >= 0 && y < n && x >= 0 && x < m;
    }
}