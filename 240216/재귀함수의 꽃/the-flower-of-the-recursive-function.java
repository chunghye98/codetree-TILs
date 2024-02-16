import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solve(n);
    }

    public static void solve(int n){
        if(n == 0) return;

        System.out.print(n+" ");
        solve(n-1);
        System.out.print(n+" ");
    }
}