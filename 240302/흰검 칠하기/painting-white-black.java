import java.io.*;
import java.util.*;

public class Main {
    
    static final int MAX_K = 100_000;

    static int n;
    static int[] tiles = new int[2 * MAX_K + 1];
    static int[] cntB = new int[2 * MAX_K + 1];
    static int[] cntW = new int[2 * MAX_K + 1];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int cur = MAX_K;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String d = st.nextToken();

            if(d.equals("L")) {
                while(x > 0) {
                    tiles[cur] = 1;
                    cntW[cur]++;
                    if(x > 1) cur--;
                    x--;
                }
            }else {
                while(x > 0) {
                    tiles[cur] = 2;
                    cntB[cur]++;
                    if(x > 1) cur++;
                    x--;
                }
            }
        }

        int g = 0;
        int w = 0;
        int b = 0;
        for(int i=0; i<=2 * MAX_K; i++) {
            if(cntB[i] >= 2 && cntW[i] >= 2) g++;
            else if(tiles[i] == 1) w++;
            else if(tiles[i] == 2) b++;
        }
        System.out.println(w+" "+b+" "+g);
    }
}