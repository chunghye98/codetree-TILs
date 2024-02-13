import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(solve(y, m, d));
    }
    
    public static String solve(int y, int m, int d) {
        if(m > 0 && m < 13) {
            if(m > 2 && m < 6) {
                if(exist(y, m, d)) {
                    return "Spring";
                }else{
                    return "-1";
                }
            }else if(m > 5 && m < 9) {
                if(exist(y, m, d)) {
                    return "Summer";
                }else{
                    return "-1";
                }
            }else if(m > 8 && m < 12) {
                if(exist(y, m, d)) {
                    return "Fall";
                }else{
                    return "-1";
                }
            }else {
                if(exist(y, m, d)) {
                    return "Winter";
                }else{
                    return "-1";
                }
            }
        }else {
            return "-1";
        }
    }

    public static boolean exist(int y, int m, int d){
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ){
            if(d > 0 && d < 32) {
                return true;
            }else{
                return false;
            }
        }else if(m == 2) {
            if(checkFeb(y)){
                if(d > 0 && d < 29) {
                    return true;
                }else {
                    return false;
                }
            }else{
                if(d > 0 && d < 30) {   
                    return true;
                }else{
                    return false;
                }
            }
            
        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            if(d > 0 && d < 31) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean checkFeb(int m) {
        if(m % 4 == 0 && m % 100 == 0 && m % 400 == 0){
            return false;
        }else if(m % 4 == 0 && m % 100 == 0) {
            return true;
        }else if(m % 4 == 0) {
            return false;
        }else{
            return true;
        }
    }
}