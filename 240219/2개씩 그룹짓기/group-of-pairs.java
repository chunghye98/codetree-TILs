import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n * 2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n*2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max = Math.max(max, arr[i] + arr[n*2 - i - 1]);
        }

        System.out.println(max);
    }
}