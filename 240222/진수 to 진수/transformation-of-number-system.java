import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String[] n = br.readLine().split("");
        int[] binary = new int[n.length];
        for(int i=0; i<n.length; i++) {
            binary[i] = Integer.parseInt(n[i]);
        }

        int num = 0;
        for(int i=0; i<n.length; i++) {
            num = num * a + binary[i];
        }

        int index = 0;
        int[] result = new int[1_000_000];
        while(true) {
            if(num < b) {
                result[index++] = num;
                break;
            }

            result[index++] = num % b;
            num /= b;
        }

        for(int i=index-1; i>=0; i--) {
            System.out.print(result[i]);
        }
    }
}