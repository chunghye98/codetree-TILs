import java.io.*;
import java.util.*;

public class Main {

    static int[] map;

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n];
        solve(n);

    }

    public static void solve(int n) {
        int value = 1;
        for(int i=0; i < n; i++) {
            for(int j=0; j<n; j++) {
                if(value == 10) {
                    value = 1;
                }
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }
}