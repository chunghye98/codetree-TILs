import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if(n < 10) return n*n;

        return solve(n / 10) + (n % 10) * (n % 10);
    }
}