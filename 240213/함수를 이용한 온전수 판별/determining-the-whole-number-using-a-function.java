import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.'
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(solve(a, b));
    }

    public static int solve(int a, int b) {
        int count = 0;

        for(int i=a; i<=b; i++) {
            if(i % 2 == 0) continue;
            else if(checkOne(i)) continue;
            else if(i % 3 == 0 && i % 9 != 0) continue;
            else count++; 
        }
        return count;
    }

    public static boolean checkOne(int i) {
        String input = String.valueOf(i);
        if(input.charAt(input.length()-1) == '5'){
            return true;
        }else {
            return false;
        }
    }
}