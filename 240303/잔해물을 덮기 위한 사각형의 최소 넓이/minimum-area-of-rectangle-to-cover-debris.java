// 1. 첫 번째 사각형의 범위에 1을 넣는다.
// 2. 두 번째 사각형과 첫 번째 사각형이 겹치는 부분을 0으로 넣는다.
// 3. 좌표를 돌면서 값이 1인 min x, min y, max x, max y를 찾는다.
// 4. (max x - min x) * (max y - min y) 를 해서 직사각형의 넓이를 출력한다.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        StringTokenizer st;
        int[][] map = new int[2001][2001];
        int offset = 1000;

        for(int i=0; i<2; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j=offset+y1; j<offset+y2; j++) {
                for(int k=offset+x1; k<offset+x2; k++) {
                    if(i == 1) {
                        map[j][k] = 0;
                        continue;
                    }
                    map[j][k] = 1;
                }
            }
        }

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        boolean flag = false;
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                if(map[i][j] == 1) {
                    minX = Math.min(minX, j);
                    maxX = Math.max(maxX, j);
                    minY = Math.min(minY, i);
                    maxY = Math.max(maxY, i);
                    flag = true;
                }
            }
        }

        if(!flag) {
            System.out.println(0);
            return;
        }
        int sum = (maxX - minX + 1) * (maxY - minY + 1);
        System.out.println(sum);
    }
}