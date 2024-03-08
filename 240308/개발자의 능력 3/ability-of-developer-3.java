import java.io.*;
import java.util.*;

public class Main {

    static int sum = 0;
    static int[] developers = new int[6];

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<6; i++) {
            developers[i] = Integer.parseInt(st.nextToken());
            sum += developers[i];
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<6; i++) {
            for(int j=1; j<6; j++) {
                for(int k=2; k<6; k++) {
                    min = Math.min(min, getTeamSum(i, j, k));
                }
            }
        }
        System.out.println(min);
    }

    public static int getTeamSum(int i, int j, int k) {
        int team1 = developers[i] + developers[j] + developers[k];
        int team2 = sum - team1;
        return Math.abs(team1 - team2);
    }
}