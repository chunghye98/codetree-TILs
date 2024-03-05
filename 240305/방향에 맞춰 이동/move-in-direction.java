import java.io.*;
import java.util.*;

public class Main {

    static int[][] map = new int[1001][1001];
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            move(dir, num);
        }
        System.out.println(x+" "+y);
    }

    public static void move(String dir, int num) {
        switch(dir) {
            case "N" :
                y += num;
                break;
            case "E" :
                x += num;
                break;
            case "W" :
                x -= num;
                break;
            case "S" :
                y -= num;
                break;
        }
    }
}