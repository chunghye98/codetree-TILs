import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            int value = Integer.parseInt(br.readLine());
            if(value % 3 == 0 && value % 2 != 0){
                System.out.println(value);
            }
        }
    }
}