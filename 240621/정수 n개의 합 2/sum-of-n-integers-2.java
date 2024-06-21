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
        for(int i=n-1; i>=n-k-1; i--) {
            max = Math.max(sums[i]-sums[i-k], max); 
        }
        System.out.println(max);
    }
}