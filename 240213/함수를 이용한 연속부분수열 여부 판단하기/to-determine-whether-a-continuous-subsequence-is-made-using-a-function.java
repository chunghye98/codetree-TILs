import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[] a = new int[n1];
        int[] b = new int[n2];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n2; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        String result = solve(a, b);
        System.out.println(result);
    }

    public static String solve(int[] a, int[] b) {
        for(int i=0; i<a.length - 1; i++) {
            for(int j=0; j<b.length -1; j++) {
                if(a[i] == b[j] && a[i+1] == b[j+1]) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
}