import java.io.*;
import java.util.*;

public class Main {

    static int[] developers = new int[5];
    static int sum = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++) {
            developers[i] = Integer.parseInt(st.nextToken());
            sum += developers[i];
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                for(int k=0; k<5; k++) {
                    if(i != j && j != k && k != i) {
                        min = Math.min(min, getDiff(i, j, k));
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }
        System.out.println(min);
    }

    public static int getDiff(int i, int j, int k) {
        int team1 = developers[i] + developers[j];
        int team2 = developers[k];
        int team3 = sum - team1 - team2;

        if(team1 == team2 || team2 == team3 || team3 == team1) {
            return Integer.MAX_VALUE;
        }

        int max = Math.max((Math.max(team1, team2)), team3);
        int min = Math.min((Math.min(team1, team2)), team3);

        return Math.abs(max - min);
    }
}