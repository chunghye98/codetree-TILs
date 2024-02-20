import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
    
        int[] dates = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(m1 == m2){
            if( d1 == d2){
                System.out.println(1);
                return;
            }else if(d1 < d2) {
                System.out.println(d2 - d1 + 1);
                return;
            }
        }        
        int result = 0;
        for(int i=m1-1; i<m2; i++){
            if(i == m1 - 1) {
                result += dates[i] - d1 + 1;
                continue;
            }
            if(i == m2 - 1) {
                result += d2;
                continue;
            }
            result += dates[i];
        }
        System.out.println(result);
    }
}