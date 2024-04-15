import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws Exception {
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

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-2; j++) {
                int count = 0;
                for(int k=i; k<i+3; k++) {
                    for(int l=j; l<j+3; l++) {
                        if(!isRange(k, l)) {
                            continue;
                        }
                        if(map[k][l] == 1) {
                            count++;
                        }
                    }
                }
                max = Math.max(count, max);
            }
        }
        System.out.println(max);
    }

    public static boolean isRange(int k, int l) {
        if(k >= n || k < 0 || l >= n || l < 0) {
            return false;
        }
        return true;
    }
}