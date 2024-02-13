import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        boolean result = check(y);
        System.out.println(result);
    }

    public static boolean check(int y) {
        
        if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            return true;
        }else if(y%4 == 0 && y % 100 == 0) {
            return false;
        }else if(y % 4 == 0) {
            return true;
        }else{
            return false;
        }
    }
}