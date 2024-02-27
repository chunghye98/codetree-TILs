import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[101];
        Arrays.fill(arr, 0);
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j=a; j<=b; j++) {
                arr[j] += 1;
            }
        }

        int max = 0;
        for(int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}