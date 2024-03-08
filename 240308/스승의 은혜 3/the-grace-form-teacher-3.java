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
        
        int max = 0;
        for(int i=0; i<n; i++) {
            int budget = b;
            int count = 0;
            // 선택된 학생의 점수를 반으로 줄임
            budget -= students[i][0]/2 + students[i][1];
            if(budget >= 0) count++;

            // 나머지 학생들에 대해 원래 점수로 선발
            int[] others = new int[n-1];
            int idx = 0;
            for(int j=0; j<n; j++) {
                if(i != j) {
                    others[idx++] = students[j][0] + students[j][1];
                }
            }
            Arrays.sort(others);
            for(int cost : others) {
                if(budget - cost >= 0) {
                    budget -= cost;
                    count++;
                } else {
                    break;
                }
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}