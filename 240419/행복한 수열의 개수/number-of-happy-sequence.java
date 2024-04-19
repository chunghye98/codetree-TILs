import java.io.*;
import java.util.*;

public class Main {


    static int[] seq = new int[100];
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

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
            for(int j=0; j<n; j++) {
                seq[j] = map[i][j];
            }

            if(isHappySeq()) {
                result++;
            }
        }

        // 열 검사 
        for(int j=0; j<n; j++) {
            for(int i=0; i<n; i++) {
                seq[i] = map[i][j];
            }

            if(isHappySeq()) {
                result++;
            }
        }

        System.out.println(result);    
    }

    public static boolean isHappySeq() {
        int max = Integer.MIN_VALUE;
        int count = 1;
        for(int i=1; i<n; i++) {
            if(seq[i-1] == seq[i]) {
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max >= m;
    }
}