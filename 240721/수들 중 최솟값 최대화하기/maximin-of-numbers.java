import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int map[][];
    static boolean visit[];
    static List<Integer> list = new ArrayList<>();
    static int max = Integer.MIN_VALUE;
    static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        input();

        find(0);

        System.out.println(ans);
    }

    public static void find(int curN) {
        if(curN == n) {
            int[] sumAndMin = getSumAndMin();
            int sum = sumAndMin[0];
            int min = sumAndMin[1];

            if(max <= sum) {
                max = sum;
                ans = Math.max(ans, min);
            }
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

    public static int[] getSumAndMin() {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<list.size()-1; i++) {
            int value = map[list.get(i)][list.get(i+1)];
            sum += value;
            min = Math.min(min, value);
        }

        int last = map[list.get(list.size()-1)][list.get(0)];
        sum += last;
        min = Math.min(min, last);

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