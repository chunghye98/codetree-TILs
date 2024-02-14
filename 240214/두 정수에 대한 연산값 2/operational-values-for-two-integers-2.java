import java.io.*;
import java.util.*;

public class Main {
    static int a, b;

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        solve();

        System.out.println(a+" "+b);
        
    }

    public static void solve(){
        if(a > b) {
            a *= 2;
            b += 10;
        }else {
            a += 10;
            b *= 2;
        }
    }
}