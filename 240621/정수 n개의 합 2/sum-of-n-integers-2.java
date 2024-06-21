import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sums = new int[n];
        sums[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<n; i++) {
            sums[i] = sums[i-1] + Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n-k; i++) {
            max = Math.max(max, sums[i+k] - sums[i]);
        }
        System.out.println(max);
    }
}