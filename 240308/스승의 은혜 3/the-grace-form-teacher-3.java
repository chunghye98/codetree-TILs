import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] students = new int[n][2];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            students[i][0] = Integer.parseInt(st.nextToken());
            students[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int sum = students[i][0] / 2 + students[i][1];
            int count = 1;
            for(int j=0; j<n; j++) {
                if(i == j) continue;
                sum += students[j][0] + students[j][1];

                if(sum > b) {
                    sum -= students[j][0] + students[j][1];
                    continue;
                }
                
                count++;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
}