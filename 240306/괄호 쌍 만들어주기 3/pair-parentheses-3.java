import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");

        int count = 0;
        for(int i=0; i<inputs.length; i++) {
            String standard = inputs[i];
            if(standard.equals(")")) continue;

            for(int j = i+1; j<inputs.length; j++) {
                if(inputs[j].equals(")")) {
                    count++;
                }
            }
        }        
        System.out.println(count);
    }
}