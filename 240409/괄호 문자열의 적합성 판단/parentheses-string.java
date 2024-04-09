import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++) {
            char value = input.charAt(i);
            if(stack.empty() || value == '(') {
                stack.push(value);
            }else {
                stack.pop();
            }
        }

        if(stack.empty()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}