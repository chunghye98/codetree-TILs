// 1. r행 c열에 있는 공이 d의 방향으로 한 칸 움직인다.
// 2. 만약 공이 벽에 부딪히면 반대로 뒤집힌다.
// 3. 1,2를 t초간 반복한다.

import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] dx = {0, 1, -1, 0}; // 북동서남
    static int[] dy = {1, 0, 0, -1};


    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String d = st.nextToken();

        int dir = -1;
        switch (d) {
            case "U" :
                dir = 0;
                break;
            case "D" :
                dir = 3;
                break;
            case "R" :
                dir = 1;
                break;
            case "L" :
                dir = 2;
                break;
        }
        
        while(t > 0) {
            int curX = c + dx[dir];
            int curY = r + dy[dir];
            if(inRange(curX, curY)) {
                c = curX;
                r = curY;
            }else {
                dir = 3 - dir;
            }
            t--;
        }

        System.out.println(r+" "+c);
    }

    public static boolean inRange(int curX, int curY) {
        if(curX <= 0 || curY <= 0 || curX > n || curY > n) {
            return false;
        }
        return true;
    }
}