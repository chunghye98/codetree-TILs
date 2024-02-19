import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for(Integer value : arr) {
            System.out.print(value+" ");
        }
        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());
        for(Integer value : arr) {
            System.out.print(value+" ");
        }

    }
}