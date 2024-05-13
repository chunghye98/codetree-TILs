import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2}; // 1시부터 시계 방향
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};

    static int n;
    static int r1;
    static int c1;
    static int r2;
    static int c2;
    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        r1 = Integer.parseInt(st.nextToken());
        c1 = Integer.parseInt(st.nextToken());
        r2 = Integer.parseInt(st.nextToken());
        c2 = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        visit = new boolean[n][n];

        bfs(r1-1, c1-1);   

        int result = map[r2-1][c2-1];
        if(result > 0) {
            System.out.println(result);
        }else {
            System.out.println(-1);
        }
    }

    public static void bfs(int y, int x) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(y, x));
        visit[y][x] = true;

        while(!queue.isEmpty()) {
            Pair now = queue.poll();
            int nowY = now.y;
            int nowX = now.x;

            for(int i=0; i<8; i++) {
                int nextY = dy[i] + nowY;
                int nextX = dx[i] + nowX;

                if(!isRange(nextY, nextX)) continue;

                if(!visit[nextY][nextX]) {
                    map[nextY][nextX] = map[nowY][nowX] + 1;
                    visit[nextY][nextX] = true;
                    queue.add(new Pair(nextY, nextX));
                }
            }
        }
    }

    public static boolean isRange(int y, int x) {
        return y >= 0 && y < n && x >= 0 && x < n;
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