import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");
        int[] binary = new int[inputs.length];
        for(int i=0; i<inputs.length; i++) {
            binary[i] = Integer.parseInt(inputs[i]);
        }

        int num = 0;
        for(int i=0; i<binary.length; i++) {
            num = num * 2 + binary[i];
        }
        System.out.println(num);
    }
}