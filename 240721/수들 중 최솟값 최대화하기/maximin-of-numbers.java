import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int map[][];
    static boolean visit[];
    static List<Integer> list = new ArrayList<>();
    static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        input();

        find(0);

        System.out.println(ans);
    }

    public static void find(int curN) {
        if(curN == n) {
            int min = getMin();
            ans = Math.max(min, ans);
            return;
        }

        for(int i=0; i<n; i++) {
            if(visit[i]) {
                continue;
            }

            visit[i] = true;
            list.add(i);

            find(curN + 1);

            visit[i] = false;
            list.remove(list.size()-1);
        }
    }

    public static int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++) {
            min = Math.min(min, map[i][list.get(i)]);
        }
        return min;
    }

    public static void input() throws Exception {
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n];

        for(int i=0; i<n; i++) {
            String[] temp = br.readLine().split(" ");
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
    }
}