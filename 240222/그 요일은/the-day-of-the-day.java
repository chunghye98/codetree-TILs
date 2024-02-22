import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        String day = br.readLine();

        int totalDays = findDates(m2, d2) - findDates(m1, d1) + 1;

        int targetDayIndex = findIndex(day);

        int count = targetDayIndex + 1;

        if(targetDayIndex+1 >= totalDays) {
            System.out.println(0);
            return;
        }

        int result = 1;
        while(count <= totalDays) {
            result++;
            count += 7;
        }

        System.out.println(result);
    }

    public static int findIndex(String day) {
        // 요일 인덱스 찾기
        List<String> days = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        return days.indexOf(day);
    }

    public static int findDates(int m, int d) {
        // 연초부터 주어진 날짜까지의 총 일수 계산
        int[] dates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        for (int i = 0; i < m - 1; i++) {
            result += dates[i];
        }
        return result + d;
    }
}