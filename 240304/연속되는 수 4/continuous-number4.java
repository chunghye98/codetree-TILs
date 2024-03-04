/*
1. 배열에 입력받기
2. 배열 돌면서
  - if 첫번째가 아니면서 이전보다 크면 count++;
  - else count = 1;
  Math.max(max, count);
3. max 출력
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(i >= 1 && arr[i] - arr[i-1] > 0) {
                count++;
            }else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}