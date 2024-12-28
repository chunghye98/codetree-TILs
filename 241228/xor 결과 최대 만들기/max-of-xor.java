import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int max;
    static int N, M;
    static int[] numbers;
    static List<Integer> results;

    public static void main(String[] args) throws Exception {
        init();
        solve(0,0);
        output();
    }

    public static void init() throws Exception{
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);

        inputs = br.readLine().split(" ");
        numbers = new int[N];
        for(int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        max = Integer.MIN_VALUE;
        results = new ArrayList<>();
    }

    public static void solve(int start, int cnt) {
        if(cnt == M) {
            int value = 0;
            for(int i=0; i<results.size(); i++) {
                value = value ^ results.get(i);
            }
            max = Math.max(value, max);
            return;
        }

        for(int i=start; i<N; i++) {
            results.add(numbers[i]);
            solve(i+1, cnt+1);
            results.remove(results.size()-1);
        }
    }

    public static void output() {
        System.out.println(max);
    }
}