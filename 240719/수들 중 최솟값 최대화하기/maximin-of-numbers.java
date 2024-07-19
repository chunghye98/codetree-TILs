import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[][] map;
    static boolean[] visit;
    static List<Integer> list = new ArrayList<>();
    static int max = Integer.MIN_VALUE;
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        input();

        find(0);

        System.out.println(ans);
        br.close();
    }

    public static void find(int depth) {
        if(depth == n) {
            int[] temp = getPriceAndMin();
            int sum = temp[0];
            
            if(sum > max) {
                max = Math.max(max, sum);
                ans = Math.min(ans, temp[1]);
            }
            return;
        }

        for(int i=0; i<n; i++) {
            if(visit[i]) {
                continue;
            }

            visit[i] = true;
            list.add(i);

            find(depth+1);

            list.remove(list.size()-1);
            visit[i] = false;
        }
    }

    public static int[] getPriceAndMin() {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        if(list.size() == 1) {
            return new int[]{map[0][0], map[0][0]};
        }

        for(int i=0; i<list.size()-1; i++) {
            sum += map[list.get(i)][list.get(i+1)];
            min = Math.min(min, map[list.get(i)][list.get(i+1)]);
        }

        sum += map[list.get(list.size()-1)][0];
        System.out.printf("sum : %d, min : %d\n", sum, min);

        return new int[]{sum, min};
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