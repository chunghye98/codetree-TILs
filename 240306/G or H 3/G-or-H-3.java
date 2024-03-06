import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] people = new int[10_001];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st.nextToken());
            String alpabet = st.nextToken();
            if(alpabet.equals("G")) {
                people[location] = 1;
            }else {
                people[location] = 2;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=1; i<10_001-k; i++) {
            int sum = 0;
            for(int j=i; j<=i+k; j++) {
                sum += people[j];
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}