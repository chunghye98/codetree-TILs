import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String code = st.nextToken();
        String color = st.nextToken();
        int second = Integer.parseInt(st.nextToken());

        MyClass m = new MyClass(code, color, second);
        System.out.println("code : "+m.code);
        System.out.println("color : "+m.color);
        System.out.println("second : "+m.second);
    }
}

class MyClass {
    String code;
    String color;
    int second;

    MyClass(String code, String color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}