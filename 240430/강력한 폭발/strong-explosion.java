import java.io.*;
import java.util.*;

public class Main {
    static final int MAX_NUM = 20;

    static int n;
    static List<Pair> bombLocations = new ArrayList<>();
    static int[][] bombed = new int[MAX_NUM][MAX_NUM];
    static int[][] bombType = new int[MAX_NUM][MAX_NUM];
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());        

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                int bombLocation = Integer.parseInt(st.nextToken());
                if(bombLocation == 1) {
                    bombLocations.add(new Pair(i, j));
                }
            }
        }

        solve(0);

        System.out.println(max);
    }

    public static void solve(int cnt) {
        if(cnt == bombLocations.size()) {
            max = Math.max(max, calc());
            return;
        }

        for(int i=1; i<=3; i++) {
            int y = bombLocations.get(cnt).y;
            int x = bombLocations.get(cnt).x;

            bombType[y][x] = i;
            solve(cnt + 1);
            bombType[y][x] = 0;
        }
    }

    public static int calc() {
        // 1. 폭탄이 터진 위치를 표시하는 배열을 초기화
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                bombed[i][j] = 0;
            }
        }

        // 2. 폭탄의 유형에 따라 터지는 영역 표시
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(bombType[i][j] > 0) {
                    bomb(i, j, bombType[i][j]);
                }
            }
        }

        // 3. 초토화된 영역 구하기
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(bombed[i][j] > 0) {
                    count++;
                }
            }
        }        
        return count;
    }

    public static void bomb(int y, int x, int type) {
        // 1. 폭탄 종류마다 터질 위치 정의
        Pair[][] bombRanges = {
            {},
            {new Pair(-2, 0), new Pair(-1, 0), new Pair(0, 0), new Pair(1, 0), new Pair(2, 0)},
            {new Pair(-1, 0), new Pair(0, 1), new Pair(0,0), new Pair(1, 0), new Pair(0, -1)},
            {new Pair(-1, -1), new Pair(-1, 1), new Pair(0,0), new Pair(1,1), new Pair(1, -1)}
        };

        // 2. 격자 내 칸에 대해서만 영역 표시
        for(int i=0; i<5; i++) {
            int nextY = bombRanges[type][i].y + y;
            int nextX = bombRanges[type][i].x + x;

            if(isRange(nextY, nextX)) {
                bombed[nextY][nextX] = 1;
            }
        }
    }

    public static boolean isRange(int y, int x) {
        return x >= 0 && x < n && y >= 0 && y < n; 
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