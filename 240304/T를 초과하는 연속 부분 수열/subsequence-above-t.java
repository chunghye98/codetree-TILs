/*
1. 배열로 입력받는다.
2. 배열을 돌면서
  - if 첫 번째가 아니면서 이전과 지금의 값이 t보다 크면 count++;
  - else count = 0;
  Math.max(max, count);
3. max 출력
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(i >= 1 && arr[i] > t && arr[i-1] > t) {
                count++;
            }else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}