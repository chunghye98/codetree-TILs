import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = solve(a, b);
        System.out.println(result);
    }

    public static int solve(int a, int b) {
        int count = 0;
        for(int i=a; i<=b; i++){
            if(isPrime(i) && allSumIsEven(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean allSumIsEven(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if(sum % 2 == 0) {
            return true;
        }
        return false;
    }
}