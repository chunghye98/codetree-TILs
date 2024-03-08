import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        map = new int[n][2];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
        } 

        int result = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    if((map[i][0] == map[j][0] || map[i][0] == map[k][0] || map[j][0] == map[k][0]) &&
                        (map[i][1] == map[j][1] || map[i][1] == map[k][1] || map[j][1] == map[k][1])) {
                            result = Math.max(result, getArea(i, j, k));
                        }
                }
            }
        }
        System.out.println(result);
    }

    public static int getArea(int i, int j, int k) {
        int maxX = Math.max(Math.max(map[i][0], map[j][0]), map[k][0]);
        int minX = Math.min(Math.min(map[i][0], map[j][0]), map[k][0]);
        int maxY = Math.max(Math.max(map[i][1], map[j][1]), map[k][1]);
        int minY = Math.min(Math.min(map[i][1], map[j][1]), map[k][1]);

        return Math.abs(maxX - minX) * Math.abs(maxY - minY);
    }
}