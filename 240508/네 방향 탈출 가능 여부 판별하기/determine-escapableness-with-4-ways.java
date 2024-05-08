import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0}; // 상우하좌
    static int[] dx = {0, 1, 0, -1};

    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visit;

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

        if(visit[n-1][m-1]) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }

    public static void bfs(int y, int x) {
        Queue<Location> queue = new LinkedList<>();
        visit[y][x] = true;
        queue.add(new Location(y, x));

        while(!queue.isEmpty()) {
            Location now = queue.poll();
            int nowY = now.y;
            int nowX = now.x;

            for(int i=0; i<4; i++) {
                int nextY = dy[i] + nowY;
                int nextX = dx[i] + nowX;

                if(!isRange(nextY, nextX)){
                    continue;
                } 

                if(map[nextY][nextX] == 1 && !visit[nextY][nextX]) {
                    queue.add(new Location(nextY, nextX));
                    visit[nextY][nextX] = true;
                }
            }
        }
    }

    public static boolean isRange(int y, int x) {
        return y >= 0 && y < n && x >= 0 && x < m;
    }
}

class Location {
    int y;
    int x;

    Location(int y, int x) {
        this.y = y;
        this.x = x;
    }
}