import java.io.*;
import java.util.*;

public class Main {
    
    static int n;
    static int[] dx = {-1, 0, 1, 0}; // 북동남서
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        String[] inputs = br.readLine().split("");

        int[][] map = new int[n][n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } 

        int x = n/2;
        int y = n/2;
        int ans = map[x][y];
        
        int dir = 0;
        for(int i=0; i<t; i++) {
            switch (inputs[i]) {
                case "L" :
                    dir = (dir - 1 + 4) % 4;
                    break;
                case "R" :
                    dir = (dir + 1) % 4;
                    break;
                case "F" :
                    int curX = x + dx[dir];
                    int curY = y + dy[dir];

                    if(!isRange(curX, curY)) continue;

                    x = curX;
                    y = curY;
                    ans += map[x][y];
                    break;
            }
        }
        System.out.println(ans);
    }
    public static boolean isRange(int curX, int curY) {
        if(curX < 0 || curY < 0 || curX >= n || curY >= n) {
            return false;
        }
        return true;
    }
}