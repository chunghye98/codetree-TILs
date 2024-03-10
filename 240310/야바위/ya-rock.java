import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
        }

        int[] yabawi = new int[4];

        int maxScore = 0;
        for(int i=1; i<=3; i++) {
            // 종이컵 초기화
            yabawi[1] = 0;
            yabawi[2] = 0;
            yabawi[3] = 0;

            // i 번째 종이컵에 처음 조약돌을 넣고 시작
            yabawi[i] = 1;

            int score = 0;
            for(int j=0; j<n; j++) {
                // 두 종이컵 교환
                int temp = yabawi[a[j]];
                yabawi[a[j]] = yabawi[b[j]];
                yabawi[b[j]] = temp;

                // c[j]번에 돌이 있다면 점수 +1
                if(yabawi[c[j]] == 1) {
                    score++;
                }
            }

            // 최대 점수 갱신
            maxScore = Math.max(maxScore, score);
        }
        System.out.println(maxScore);
    }
}