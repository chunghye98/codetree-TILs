import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String[] days = {"Mon", "Tue","Wed","Thu","Fri","Sat","Sun"};

        int target = findDates(m2, d2);
        int standard = findDates(m1, d1);

        if(target < standard) {
            System.out.println(days[days.length - Math.abs(target-standard) % 7]);
        }else {
            System.out.println(days[(target - standard) % 7]);
        }
    }

    public static int findDates(int m, int d) {
        int[] dates = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int result = 0;
        for(int i=0; i<m-1; i++) {
            result += dates[i];
        }
        result += d;
        return result;
    }
}