import java.io.*;
import java.util.*;

public class Main {

    static int k;
    static int n;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        choose(1);

    }

    public static void choose(int num) {
        if(num == n+1) {
            print();
            return;
        }

        for(int i=1; i<=k; i++) {
            list.add(i);
            choose(num + 1);
            list.remove(list.size()-1);
        }
    }

    public static void print() {
        StringBuilder sb = new StringBuilder();
        for(int value : list) {
            sb.append(value+" ");
        }
        System.out.println(sb);
    }
}