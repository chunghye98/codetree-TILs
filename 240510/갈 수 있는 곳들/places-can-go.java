import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0}; // 상우하좌
    static int[] dx = {0, 1, 0, -1};

    static int n;
    static int k;
    static int[][] map;
    static boolean[][] visit;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        visit = new boolean[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        List<Pair> pairs = new ArrayList<>();
        for(int i=0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            pairs.add(new Pair(y-1, x-1));
        }

        // 2. 시작점 리스트를 돌면서 bfs 수행
        for(Pair p : pairs) {
            bfs(p);
        }

        // 3. 이동할 수 있는 칸 개수 출력
        System.out.println(count);
    }

    public static void bfs(Pair p) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(p);
        if(!visit[p.y][p.x]) {
            count++;
        }
        visit[p.y][p.x] = true;

        while(!queue.isEmpty()) {
            Pair now = queue.poll();
            int nowY = now.y;
            int nowX = now.x;

            for(int i=0; i<4; i++) {
                int nextY = dy[i] + nowY;
                int nextX = dx[i] + nowX;

                if(!isRange(nextY, nextX)) {
                    continue;
                }
                
                if(map[nextY][nextX] == 0 && !visit[nextY][nextX]) {
                    queue.add(new Pair(nextY, nextX));
                    visit[nextY][nextX] = true;
                    count++;
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