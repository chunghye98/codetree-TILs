import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a % 3 == 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        if(a % 5 == 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}