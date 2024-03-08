import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] map = new int[n][2];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1]= Integer.parseInt(st.nextToken());    
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i != j) {
                    int x1 = map[i][0];
                    int y1 = map[i][1];
                    int x2 = map[j][0];
                    int y2 = map[j][1];

                    int square = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
                    min = Math.min(min, square);
                }
            }
        }
        System.out.println(min);
    }
}