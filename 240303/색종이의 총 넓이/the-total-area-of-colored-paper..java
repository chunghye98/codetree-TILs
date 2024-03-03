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
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=offset+y; j<offset+y+8; j++ ) {
                for(int k=offset+x; k<offset+x+8; k++) {
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