import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        // 행 검사 
        for(int i=0; i<n; i++) {
            int num = map[i][0];
            int count = 1;
            for(int j=1; j<n; j++) {
                if(map[i][j] == num) {
                    count++;
                    continue;
                }
                num = map[i][j];
                count = 1;
            }

            if(count >= m) {
                result++;
            }
        }

        // 열 검사 
        for(int j=0; j<n; j++) {
            int num = map[0][j];
            int count = 1;
            for(int i=1; i<n; i++) {
                if(map[i][j] == num) {
                    count++;
                    continue;
                }
                num = map[i][j];
                count = 1;
            }

            if(count >= m) {
                result++;
            }
        }
        System.out.println(result);

    }
}