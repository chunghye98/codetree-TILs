import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(i >= 1 && ((arr[i] < 0 && arr[i-1] < 0) || (arr[i] > 0) && arr[i-1] > 0)) {
                count++;
            }else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}