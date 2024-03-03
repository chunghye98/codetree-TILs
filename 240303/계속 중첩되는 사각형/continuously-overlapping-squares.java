import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[201][201];
        int offset = 100;

        StringTokenizer st;
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j=offset+y1; j<offset+y2; j++) {
                for(int k=offset+x1; k<offset+x2; k++) {
                    if(i % 2 != 0) { // 빨간색
                        map[j][k] = 1;
                    }else { // 파란색
                        map[j][k] = 2;
                    }
                }
            }
        }

        int count = 0;
        for(int[] m : map) {
            for(int v : m) {
                if(v == 2) count++;
            }
        }
        System.out.println(count);
    }
}