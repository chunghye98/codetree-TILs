import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n;
    private static List<Integer> list = new ArrayList<>();
    private static boolean[] visit;

    public static void print() {
        for(int v : list) {
            System.out.print(v+" ");
        }
        System.out.println();
    }

    public static void choose(int curN) {
        if(curN == 0) {
            print();
            return;
        }

        for(int i=n; i>0; i--) {
            if(visit[i]){
                continue;
            }

            visit[i] = true;
            list.add(i);

            choose(curN-1);

            list.remove(list.size()-1);
            visit[i] = false;
        }
    }

    public static void input() throws Exception {
        n = Integer.parseInt(br.readLine());
        visit = new boolean[n+1];
    }

    public static void main(String[] args) throws Exception{
        input();
        choose(n);
    }
}