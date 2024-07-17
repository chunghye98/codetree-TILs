import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n;
    private static List<Integer> list = new ArrayList<>();
    private static boolean[] visit;
    private static int[][] map;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        input();

        choose(0);
        System.out.println(max);
    }

    public static void input() throws Exception {
        n = Integer.parseInt(br.readLine());
        visit = new boolean[n];
        map = new int[n][n];

        for(int i=0; i<n; i++) {
            String[] temp = br.readLine().split(" ");
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
    }

    public static void choose(int curX) {
        if(curX == n) {
            int sum = getSum();
            max = Math.max(max, sum);
            return;
        }

        for(int i=0; i<3; i++) {
            if(visit[i]) {
                continue;
            }

            list.add(i);
            visit[i] = true;

            choose(curX+1);

            list.remove(list.size() - 1);
            visit[i] = false;
        }
    }

    public static int getSum() {
        int sum = 0;
        for(int i=0; i<list.size(); i++) {
            sum += map[i][list.get(i)];
        }
        return sum;
    }
}