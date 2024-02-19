import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] inputs = input.toCharArray();
        Arrays.sort(inputs);
        String result = new String(inputs);
        System.out.println(result);
    }
}