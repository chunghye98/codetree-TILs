import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++) {
            if(sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}