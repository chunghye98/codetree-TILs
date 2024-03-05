import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] students = new int[n + 1];
        Arrays.fill(students, 0);
        int ans = -1;

        for(int i=0; i<m; i++) {
            int x = Integer.parseInt(br.readLine());
            students[x] += 1; 

            if(students[x] >= k) {
                ans = x;
                break;
            }
        }
        System.out.println(ans);
    }
}