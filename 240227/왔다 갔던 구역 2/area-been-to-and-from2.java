import java.io.*;
import java.util.*;

public class Main {

    private static int[] arr;
    private static int index = 50_000;

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[100_000];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            String d = st.nextToken();

            move(a, d);
        }

        int sum = 0;
        for(int value : arr) {
            if(value > 1) sum += 1;
        }
        System.out.println(sum);
    }

    public static void move(int n, String direct) {
        if(direct.equals("L")) {
            for(int i=index-n; i<index; i++) {
                arr[i] += 1;
            }
            index -= n;
        }else if(direct.equals("R")) {
           for(int i=index; i<index+n; i++) {
                arr[i] += 1;
            }
            index += n;
        }
    }
}