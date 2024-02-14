import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if(upperTwo(input)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean upperTwo(String input){
        char before = input.charAt(0);
        for(int i=1; i<input.length(); i++){
            if(before != input.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}