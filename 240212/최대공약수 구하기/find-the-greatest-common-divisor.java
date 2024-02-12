import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> nDivisor = findDivisor(n);
        List<Integer> mDivisor = findDivisor(m);

        int max = Integer.MIN_VALUE;
        for(Integer value : nDivisor) {
            if(mDivisor.contains(value)) {
                max = Math.max(max, value);
            }
        }
        System.out.println(max);
    }

    public static List<Integer> findDivisor(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}