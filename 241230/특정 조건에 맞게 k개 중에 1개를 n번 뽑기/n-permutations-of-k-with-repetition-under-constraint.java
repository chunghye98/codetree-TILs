import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static List<Integer> numbers;
    static int N, M;

    public static void main(String[] args) throws Exception {
        init();
        solve(1, 0);
        output();
    }

    public static void init() throws Exception {
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        numbers = new ArrayList<>();
    }

    public static void solve(int curN, int cnt) {
        if(cnt == M) {
            if(check()) {
                print();
            }
            return;
        }

        for(int i=1; i<=N; i++) {
            numbers.add(i);
            solve(i, cnt+1);
            numbers.remove(numbers.size()-1);
        }
    }

    public static boolean check() {
        for(int i=1; i<numbers.size()-1; i++) {
            if(numbers.get(i-1) == numbers.get(i) && numbers.get(i) == numbers.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static void print() {
        for(int value : numbers) {
            sb.append(value).append(" ");
        }
        sb.append("\n");
    }

    public static void output() {
        System.out.println(sb);
    }
}