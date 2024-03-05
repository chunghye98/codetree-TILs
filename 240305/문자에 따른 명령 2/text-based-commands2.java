import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1}; // 북 동 남 서
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");

        int dir = 0; // 북
        int x = 0;
        int y = 0;
        for(int i=0; i<inputs.length; i++){
            if(inputs[i].equals("L")) {
                dir = (dir - 1 + 4) % 4;
            }else if(inputs[i].equals("R")) {
                dir = (dir + 1) % 4;
            }else {
                x = dx[dir] + x;
                y = dy[dir] + y;
            }
        }
        System.out.println(x+" "+y);

    }
}