import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(check(n)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean check(int n) {
        if(n % 2 == 0 && (n/10 + n%10) % 5 == 0 ) {
            return true;
        }else return false;
    }
}