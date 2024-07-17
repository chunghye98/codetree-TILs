import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static List<Integer> list = new ArrayList<>();
    private static int n;
    private static boolean[] visited;

    public static void input() throws Exception {
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
    }

    public static void choose(int curN) {
        if(curN == n+1){
            print();
            return;
        }

        for(int i=1; i<=n; i++) {
            if(visited[i]) {
                continue;
            }

            visited[i] = true;
            list.add(i);

            choose(curN+1);

            list.remove(list.size()-1);
            visited[i] = false;
        }
    }

    public static void print() {
        for(int v : list) {
            System.out.print(v+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        input();
        choose(1);
    }
}