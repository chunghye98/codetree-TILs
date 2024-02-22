import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");
        int[] binarys = new int[inputs.length];

        for(int i=0; i<inputs.length; i++) {
            binarys[i] = Integer.parseInt(inputs[i]);
        }

        int num = 0;
        for(int i=0; i<inputs.length; i++) {
            num = num * 2 + binarys[i];
        }

        num *= 17;
        int index = 0;
        int[] result = new int[1_000_000];
        while(true) {
            if(num < 2) {
                result[index++] = num;
                break;
            }
            result[index++] = num % 2;
            num /= 2;
        }

        for(int i=index - 1; i>=0; i--) {
            System.out.print(result[i]);
        }
    }
}