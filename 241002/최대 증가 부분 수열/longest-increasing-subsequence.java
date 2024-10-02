import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] arr;
    static int[] dp;
    static int max;

    public static void main(String[] args) throws Exception {
        init();
        solve();
        output();
    }

    public static void output() {
        System.out.println(max);
    }

    public static void solve() {
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 1;

        for(int i=1; i<N; i++) {
            for(int j=0; j<i; j++) {
                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }else {
                    dp[i] = dp[j];
                }
            }
        }

        max = Integer.MIN_VALUE;
        for(int v : dp) {
            max = Math.max(v, max);
        }
    }

    public static void init() throws Exception {
        N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        
        arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        dp = new int[N];
    }
}