import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push" : 
                    int value = Integer.parseInt(st.nextToken());
                    stack.push(value);
                    break;
                case "size" : 
                    System.out.println(stack.size());
                    break;
                case "pop" :
                    System.out.println(stack.pop());
                    break;
                case "empty" :
                    if(stack.empty()) {
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "top" :
                    System.out.println(stack.peek());
                    break;
            }
        }
    }
}