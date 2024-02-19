import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Agent a = null;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            String id = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            if(min > score) {
                min = score;
                a = new Agent(id, score);
            }
        }

        System.out.println(a.id+" "+a.score);
    }
}

class Agent {
    String id;
    int score;

    Agent(String id, int score) {
        this.id = id;
        this.score = score;
    }
}