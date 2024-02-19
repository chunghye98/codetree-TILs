import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        int code = Integer.parseInt(st.nextToken());

        Product p1 = new Product("codetree", 50);
        Product p2 = new Product(name, code);

        System.out.println("product "+p1.code+" is "+p1.name);
        System.out.println("product "+p2.code+" is "+p2.name);
    }
}

class Product {
    String name;
    int code;

    Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}