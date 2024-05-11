import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0}; // 상우하좌
    static int[] dx = {0, 1, 0, -1};

    static int[][] map;
    static boolean[][] visit;
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(0, 0);

        if(map[n-1][m-1] > 1) {
            System.out.println(map[n-1][m-1]);
        }else {
            System.out.println(-1);
        }
    }

    public static void bfs(int y, int x) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(y, x));
        visit[y][x] = true;
        map[y][x] = 0;

        while(!queue.isEmpty()) {
            Pair now = queue.poll();
            int nowY = now.y;
            int nowX = now.x;

            for(int i=0; i<4; i++) {
                int nextY = dy[i] + nowY;
                int nextX = dx[i] + nowX;

                if(!isRange(nextY, nextX)) continue;

                if(!visit[nextY][nextX] && map[nextY][nextX] == 1) {
                    map[nextY][nextX] = map[nowY][nowX] + 1;
                    visit[nextY][nextX] = true;
                    queue.add(new Pair(nextY, nextX));
                }
            }
        }
    }

    public static boolean isRange(int y, int x) {
        return y >= 0 && y < n && x >= 0 && x < m;
    }
}

class Pair {
    int y;
    int x;

    Pair(int y, int x) {
        this.y = y;
        this.x = x;
    }
}