import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int index = n-1;
        System.out.println(solve(max, arr, index));
    }

    public static int solve(int max, int[] arr, int index){
        if(index == 0) return Math.max(max, arr[0]);

        return solve(Math.max(max, arr[index]), arr, index-1);
    }
}