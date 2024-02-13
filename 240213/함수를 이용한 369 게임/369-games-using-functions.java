import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = count(a, b);
        System.out.println(result);
    }

    public static int count(int a, int b) {
        int count = 0;
        for(int i=a; i<=b; i++) {
            if(i % 3 == 0 || checkNumber(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkNumber(int i) {
        String value = String.valueOf(i);
        if(value.contains("3") || value.contains("6") || value.contains("9")) {
            return true;
        }
        return false;
    }
}