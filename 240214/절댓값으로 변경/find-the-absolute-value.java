import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solve(arr);
        for(int value : arr){
            System.out.print(value +" ");
        }
    }

    public static void solve(int[] arr) {
        for(int i=0; i<arr.length; i++){
            arr[i] = Math.abs(arr[i]);
        }
    }
}