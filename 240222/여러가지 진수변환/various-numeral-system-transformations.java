import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000];
        int index = 0;
        while(true) {
            if(n < b) {
                arr[index++] = n;
                break;
            }

            arr[index++] = n % b;
            n /= b;
        }

        for(int i=index-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}