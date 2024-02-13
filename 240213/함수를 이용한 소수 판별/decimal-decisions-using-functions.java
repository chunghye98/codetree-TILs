import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = sumPrimes(a, b);
        System.out.println(result);
    }

    public static int sumPrimes(int a, int b) {
        int count = 0;
        for(int i=a; i<=b; i++) {
            if(isPrime(i)) {
                count+=i;
            }
        }
        return count;
    }

    public static boolean isPrime(int i) {
        if(i==1) return false;
        for(int j=2; j<i; j++) {
            if(i%j == 0) {
                return false;
            }
        }
        return true;
    }
}