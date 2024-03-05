import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] moveA = new int[1_000_001];
        int[] moveB = new int[1_000_001];
        int time = 0;
        moveA[0] = 0;
        moveB[0] = 0;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for(int j=time+1; j<=time+t; j++) {
                moveA[j] = moveA[j-1] + v;
            }
            time += t;
        }

        time = 0;
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for(int j=time+1; j<=time+t; j++) {
                moveB[j] = moveB[j-1] + v;
            }
            time += t;
        }

        int ans = 0;
        String leader = "";
        for(int i=1; i<=time; i++) {
            if(moveA[i] - moveB[i] > 0) {
                if(!leader.equals("a")) {
                    ans++;
                }
                leader = "a";

            }else if(moveA[i] - moveB[i] < 0) {
                if(!leader.equals("b")) {
                    ans++;
                }
                leader = "b";
            }else {
                if(!leader.equals("ab")) {
                    ans++;
                }
                leader = "ab";
            }
        }
        System.out.println(ans);
    }
}