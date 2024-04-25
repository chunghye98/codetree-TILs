import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited;
    static List<List<Integer>> graph;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        visited[1] = true;
        dfs(1);
        
        System.out.println(count);
    }

    public static void dfs(int node) {
        for(int next : graph.get(node)) {
            if(!visited[next]) {
                visited[next] = true;
                count++;
                dfs(next);
            }
        }
    }
}