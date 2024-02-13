import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String input = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        System.out.println(solve(a, input, b));
    }

    public static String solve(int a, String input, int b) {
        
        int n = 0;
        String result = a +" ";
        if(input.equals("+")) {
            n = a + b;
            result += "+";
        }else if(input.equals("-")) {
            n = a - b;
            result += "-";
        }else if(input.equals("/")) {
            n = a / b;
            result += "/";
        }else if(input.equals("*")) {
            n = a * b;
            result += "*";
        }else{
            return "False";
        }

        return result +" " + b + " = " + n;
    }
}