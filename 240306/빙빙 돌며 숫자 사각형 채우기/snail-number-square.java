import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1}; // 행렬, 동남서북
    static int[] dy = {1, 0, -1, 0};
    static int n;

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int x = 0;
        int y = 0;
        map[x][y] = 1;
        int dir = 0; // 동
        for(int i=2; i<=n*m; i++) {
            int curX = x + dx[dir];
            int curY = y + dy[dir];

            if(!inRange(curX, curY) || map[curX][curY] != 0) {
                dir = (dir + 1) % 4;
            }

            x = x + dx[dir];
            y = y + dy[dir];
            map[x][y] = i;
        }
        
        for(int[] mm : map) {
            for(int v : mm) {
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
    public static boolean inRange(int curX, int curY) {
        if(curX < 0 || curY < 0 || curX >= n || curY >= n) {
            return false;
        }
        return true;
    }
}