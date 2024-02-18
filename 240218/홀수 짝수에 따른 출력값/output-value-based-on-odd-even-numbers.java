import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n % 2 == 0) {
            System.out.println(even(n));
        }else {
            System.out.println(odd(n));
        }
    }

    public static int even(int n) {
        if(n == 2) return 2;

        return n + even(n-2);
    }

    public static int odd(int n){
        if(n == 1) return 1;

        return n + odd(n-2);
    }
}