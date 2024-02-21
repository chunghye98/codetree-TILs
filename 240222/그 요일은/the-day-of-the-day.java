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
        String day = br.readLine();


        int target = findDates(m2, d2);
        int standard = findDates(m1, d1);

        int count = target-standard+2;

        System.out.println(count / 7);

    }

    public static int findIndex(String day) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for(int i=0; i<days.length; i++) {
            if(days[i].equals(day)) {
                return i;
            }
        }
        return -1;
    }

    public static int findDates(int m, int d) {
        int[] dates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        for(int i=0; i<m-1; i++) {
            result += dates[i];
        }
        result += d;
        return result;
    }
}