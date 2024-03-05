import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {1, 0, -1, 0}; // 동남서북
    static int[] dy = {0, -1, 0, 1};
    static int n;

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int count = 0;
                for(int k=0; k<4; k++) {
                    int curX = i + dx[k];
                    int curY = j + dy[k];
                    if(inRange(curX, curY) && map[curX][curY] == 1) {
                        count++;
                    }
                }
                if(count >= 3) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean inRange(int x, int y) {
        if(x < 0 || y < 0 || x >= n || y >= n) {
            return false;
        }
        return true;
    }
}