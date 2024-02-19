import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        MyClass c = new MyClass(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
        System.out.println("secret code : "+c.secretCode);
        System.out.println("meeting point : "+c.meetingPoint);
        System.out.println("time : "+c.time);
    }
}

class MyClass {
    String secretCode;
    String meetingPoint;
    int time;

    MyClass(String secretCode, String meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}