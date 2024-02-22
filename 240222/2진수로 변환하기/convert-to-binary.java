import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
    
        int[] arr = new int[100_000];
        int index = 0;
        while(true) {
            if(n < 2) {
                arr[index++] = n;
                break;
            }

            arr[index++] = n % 2;
            n /= 2;
        }

        for(int i=index-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}