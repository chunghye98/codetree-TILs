/*
1. 배열에 입력 담기
2. 배열 돌면서
  - if(첫 번째가 아니면서 이전과 부호가 같으면) count++;
  - else count = 1;
  Math.max(max, count);
3. max 출력
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(i >= 1 && arr[i] * arr[i-1] > 0) {
                count++;
            }else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}