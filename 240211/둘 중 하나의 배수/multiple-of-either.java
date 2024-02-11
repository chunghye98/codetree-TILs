import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a % 3 ==0 || a % 5 == 0) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}