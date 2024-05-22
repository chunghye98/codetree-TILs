import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0}; //상우하좌
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

        List<Integer> persons = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(isRange(i, j) && !visit[i][j] && map[i][j] == 1) {
                    visit[i][j] = true;
                    count = 1;
                    dfs(i, j);
                    persons.add(count);
                }
            }
        }

        Collections.sort(persons);

        System.out.println(persons.size());
        for(int p : persons) {
            System.out.println(p);
        }
    }

    public static void dfs(int y, int x){
        for(int i=0; i<4; i++) {
            int nextY = dy[i] + y;
            int nextX = dx[i] + x;

            if(isRange(nextY, nextX) && !visit[nextY][nextX] && map[nextY][nextX] == 1) {
                visit[nextY][nextX] = true;
                count++;
                dfs(nextY, nextX);
            }
        }
    }

    public static boolean isRange(int y, int x) {
        return y >= 0 && y < n && x >= 0 && x < n;
    }
}