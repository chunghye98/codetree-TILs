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

        System.out.println(makeStar(n));
        solve(n-1);
        System.out.println(makeStar(n));
    }

    public static String makeStar(int n) {
        String result = "";
        for(int i=0; i<n; i++) {
            result += "* ";
        }
        return result;
    }
}