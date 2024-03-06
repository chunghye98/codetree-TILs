import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] homes = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            homes[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int sumDis = 0;
            for(int j=0; j<n; j++) {
                sumDis += homes[j] * Math.abs(j-i);
            }
            min = Math.min(min, sumDis);
        }
        System.out.println(min);
    }
}