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
            map[i][1] = Integer.parseInt(st.nextToken());
        }

        int minRec = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int maxY = Integer.MIN_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int minX = Integer.MAX_VALUE;

            for(int j=0; j<n; j++) {
                if(i != j) {
                    maxX = Math.max(maxX, map[j][0]);
                    minX = Math.min(minX, map[j][0]);
                    maxY = Math.max(maxY, map[j][1]);
                    minY = Math.min(minY, map[j][1]);
                }
            }

            int rec = (maxX - minX) * (maxY - minY);

            minRec = Math.min(minRec, rec);
        }
        System.out.println(minRec);
    }
}