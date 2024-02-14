import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String reverseInput = reverse(input);

        if(input.equals(reverseInput)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static String reverse(String input){
        String result = "";
        for(int i=input.length()-1; i>=0; i--) {
            result += String.valueOf(input.charAt(i));
        }
        return result;
    }
}