import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String id = st.nextToken();
        int level = Integer.parseInt(st.nextToken());

        User user1 = new User();
        System.out.println("user "+user1.id+" lv "+user1.level);

        User user2 = new User(id, level);
        System.out.println("user "+user2.id+" lv "+user2.level);
    }
}

class User {
    String id;
    int level;

    User() {
        this.id = "codetree";
        this.level = 10;
    }

    User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}