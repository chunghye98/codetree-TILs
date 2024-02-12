import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        if(a <= 0) {
            System.out.println(0);
            return;
        }

        String result = "";
        String strA = String.valueOf(a);
        for(int i=0; i<b; i++){
            result += strA;
        }
        System.out.println(result);
    }
}