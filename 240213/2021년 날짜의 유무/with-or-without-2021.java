import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(solve(m, d));
    }

    public static String solve(int m, int d){
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ){
            if(d > 0 && d < 32) {
                return "Yes";
            }else{
                return "No";
            }
        }else if(m == 2) {
            if(d > 0 && d < 29) {
                return "Yes";
            }else{
                return "No";
            }
        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            if(d > 0 && d < 31) {
                return "Yes";
            }else{
                return "No";
            }
        }else{
            return "No";
        }
    }
}