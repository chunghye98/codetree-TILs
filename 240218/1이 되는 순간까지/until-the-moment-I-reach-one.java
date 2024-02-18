import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        System.out.println(solve(n, count));
    }

    public static int solve(int n, int count) {
        if(n == 1) return count;

        count++;
        if(n % 2 == 0) {
            return solve(n/2, count);
        }else {
            return solve(n/3, count);
        }
    }
}