import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int max = Math.max(n, m);
        int min = Math.min(n, m);
        if(max % min == 0) {
            System.out.println(max);
            return;
        }

        List<Integer> nDivisors = findDivisor(n);
        List<Integer> mDivisors = findDivisor(m);

        List<Integer> divisors = new ArrayList<>();
        for(Integer value : nDivisors) {
            if(mDivisors.contains(value)) {
                divisors.add(value);
            }
        }

        if(divisors.size() == 1) {
            System.out.println(n * m);
            return;
        }

        int result = 1;
        for(Integer d : divisors) {
            result *= d;
        }

        System.out.println(result);
    }

    public static List<Integer> findDivisor(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

}