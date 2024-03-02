import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] map = new int[201][201];
        for(int[] m : map) {
            Arrays.fill(m, 0);
        }

        int offset = 100;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j=y1+offset; j<y2+offset; j++) {
                for(int k=x1+offset; k<x2+offset; k++) {
                    map[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for(int[] m : map) {
            for(int v : m) {
                sum += v;
            }
        }
        System.out.println(sum);
    }
}