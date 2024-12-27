import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static List<Integer> answer;

    public static void main(String[] args) throws Exception {
        init();
        solve(1, 0);
        output();
    }

    public static void init() throws Exception {
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        answer = new ArrayList<>();
    }

    public static void solve(int curN, int cnt) {
        if(curN == N+1) {
            if(cnt == M) {
                print();
            }
            return;
        }

        // curN에 해당하는 숫자를 사용하는 경우
        answer.add(curN);
        solve(curN+1, cnt+1);
        answer.remove(answer.size()-1);
        
        // curN에 해당하는 숫자를 사용하지 않는 경우
        solve(curN+1, cnt);
    }

    public static void print() {
        for(int value : answer) {
            sb.append(value).append(" ");
        }
        sb.append("\n");
    }

    public static void output() {
        System.out.println(sb);
    }
}