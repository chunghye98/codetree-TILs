import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            nums[i] *= 2;

            for(int j=0; j<n; j++) {
                int[] remainNums = new int[n-1];
                int count = 0;
                for(int k=0; k<n; k++) {
                    if(k != j) {
                        remainNums[count++] = nums[k];
                    }
                }
                int sumDiff = 0;
                for(int k=0; k<n-2; k++) {
                    sumDiff += Math.abs(remainNums[k+1] - remainNums[k]);
                }
                minDiff = Math.min(minDiff, sumDiff);
            }

            nums[i] /= 2;
        }
        System.out.println(minDiff);
    }
}