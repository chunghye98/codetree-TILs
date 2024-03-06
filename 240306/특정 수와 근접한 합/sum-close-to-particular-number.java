import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int sum = 0;
                for(int k=0; k<n; k++) {
                    if(i != j && i != k && j != k ) {
                        sum += nums[k];
                    }
                }
                min = Math.min(min, Math.abs(sum - s));
            }
        }
        System.out.println(min);
    }
}