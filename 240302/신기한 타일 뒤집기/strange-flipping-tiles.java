import java.io.*;
import java.util.*;

public class Main {
    static final int MAX_K = 100_000;

    static int[] tiles = new int[2 * MAX_K + 1];

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int cur = MAX_K;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            if(dir.equals("L")) {
                while(x > 0) {
                    tiles[cur] = 1;
                    if(x > 1) cur--;
                    x--;
                }
            }else if(dir.equals("R")) {
                while(x > 0) {
                    tiles[cur] = 2;
                    if(x > 1) cur++;
                    x--;
                }
            }
        }

        int w = 0;
        int b = 0;
        for(int value : tiles) {
            if(value == 1) w++;
            else if(value == 2) b++;
        }
        System.out.println(w+" "+b);
    }
}