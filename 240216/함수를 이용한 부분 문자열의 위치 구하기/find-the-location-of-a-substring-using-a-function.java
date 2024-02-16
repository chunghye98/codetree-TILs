import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String target = br.readLine();

        System.out.println(solve(input, target));
    }

    public static int solve(String input, String target) {
        int end = target.length();

        for(int i=0; i<=input.length() - end; i++) {
            if(input.substring(i, i + end).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}