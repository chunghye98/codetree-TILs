import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputA = br.readLine().toCharArray();
        char[] inputB = br.readLine().toCharArray();

        Arrays.sort(inputA);
        Arrays.sort(inputB);

        String resultA = new String(inputA);
        String resultB = new String(inputB);

        if(resultA.equals(resultB)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}