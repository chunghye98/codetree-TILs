import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[][] map;
    static boolean[] visit;
    static List<Integer> list = new ArrayList<>();
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        input();

        find(0);

        System.out.println(min);
    }

    public static void find(int curN) {
        if(curN == 4) {
            int sum = getSum();
            min = Math.min(min, sum);
            return;
        }

        for(int i=0; i<n; i++) {
            if(visit[i]) {
                continue;
            }
            
            visit[i] = true;
            list.add(i);

            find(curN + 1);

            list.remove(list.size()-1);
            visit[i] = false;
        }
    }

    public static int getSum() {
        int sum = 0;
        boolean isZero = false;
        for(int i=0; i<list.size()-1; i++) {
            int value = map[list.get(i)][list.get(i+1)];
            if(value == 0) {
                isZero = true;
                break;
            }
            sum += value;
        }
        int last = map[list.get(list.size()-1)][list.get(0)];
        if(last == 0) {
            isZero = true;
        }

        if(isZero) {
            return Integer.MAX_VALUE;
        }

        return sum + last;
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