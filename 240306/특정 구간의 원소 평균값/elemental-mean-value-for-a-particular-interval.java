import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i <n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += nums[j];

                double avg = 0.0;
                if(i==j) {
                    avg = nums[i];
                }else {
                    avg = (double)sum / (j - i + 1);
                }

                for(int k=i; k<=j; k++) {
                    if(avg == nums[k]) {
                        count++;
                        break;
                    }
                }
            }
            
        }
        System.out.println(count);

    }
}