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

        solve(arr);
    }

    public static void solve(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i]/2 + " ");
            }else {
                System.out.print(arr[i]+" ");
            }
        }
    }
}