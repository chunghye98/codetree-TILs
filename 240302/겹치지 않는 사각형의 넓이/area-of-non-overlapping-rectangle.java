import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] map = new int[2001][2001];
        for(int[] m : map) {
            Arrays.fill(m, 0);
        }
        int offset = 1000;
        StringTokenizer st;
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
        
            for(int j = offset + y1; j < offset + y2 ; j++) {
                for(int k = offset + x1; k < offset + x2; k++) {
                    if(i == 2) {
                        map[j][k] = 0;
                        continue; 
                    }
                    map[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for(int[] m : map) {
            for(int v : m) {
                if(v == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }
}