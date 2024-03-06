import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String[][] map = new String[r][c];

        for(int i=0; i<r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<c; j++) {
                map[i][j] = st.nextToken();
            }
        }  

        int result = 0;
        for(int i=1; i<r; i++) {
            for(int j=1; j<c; j++) {
                for(int k=i+1; k<r-1; k++) {
                    for(int l=j+1; l<c-1; l++) {
                        if(!map[0][0].equals(map[i][j]) &&
                           !map[i][j].equals(map[k][l]) &&
                           !map[k][l].equals(map[r-1][c-1])) {
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}