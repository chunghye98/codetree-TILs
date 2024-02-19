import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if(checkEquals(arrA, arrB)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean checkEquals(int[] arrA, int[] arrB) {
        for(int i=0; i<arrA.length; i++) {
            if(arrA[i] != arrB[i]){
                return false;
            }
        }
        return true;
    }
}