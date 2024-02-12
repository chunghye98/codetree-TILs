import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> nDivisor = fidnDivisor(n);
        List<Integer> mDivisor = fidnDivisor(m);

        List<Integer> divisors = new ArrayList<>();
        for(Integer value : nDivisor) {
            if(mDivisor.contains(value)) {
                divisors.add(value);
            }
        }

        int result = 1;
        for(Integer d : divisors) {
            result *= d;
        }

        System.out.println(result);
    }

    public static List<Integer> fidnDivisor(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}