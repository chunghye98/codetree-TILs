import java.io.*;
import java.util.*;


public class Main {

    static int time = 0;
    static int location = 0;
    
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int[] moveA = new int[1_000_001];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            moveA = move(d, t, moveA);
        }

        time = 0;
        location = 0;
        int[] moveB = new int[1_000_001];
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            moveB = move(d, t, moveB);
        }

        for(int i=1; i<time; i++){
            if(moveA[i] == moveB[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    public static int[] move(String d, int t, int[] arr) {
        arr[time] = location;
        for(int i = time + 1; i <= time + t; i++) {
            if(d.equals("L")){
                location -= 1;
            }else {
                location += 1;
            }
            arr[i] = location;
        }
        time += t;        
        return arr;
    }
}