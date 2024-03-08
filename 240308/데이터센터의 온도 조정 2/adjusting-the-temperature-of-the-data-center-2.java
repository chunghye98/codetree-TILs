import java.io.*;
import java.util.*;

public class Main {

    static int[] ta = new int[1000];
    static int[] tb = new int[1000];
    static int n;
    static int c;
    static int g;
    static int h;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            ta[i] = Integer.parseInt(st.nextToken());
            tb[i] = Integer.parseInt(st.nextToken());
        }

        int maxOut = 0;
        for(int t = 0; t <= 1000; t++) {
            maxOut = Math.max(maxOut, performance(t));
        }
        System.out.println(maxOut);
    }

    public static int performance(int t) {
        int total = 0;
        for(int i=0; i<n; i++) {
            total += sigle(ta[i], tb[i], t);
        }
        return total;
    }

    // 특정 장비의 t 온도에서의 작업량 계산
    public static int sigle(int low, int high, int t) {
        if(t < low)
            return c;
        else if(t <= high)
            return g;
        else 
            return h;
    }
}