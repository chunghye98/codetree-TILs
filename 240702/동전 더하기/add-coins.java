import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(Collections.reverseOrder());

        int count = 0;
        int index = 0;
        while(k > 1) {
            int n = list.get(index);
            count += k / n;
            k = k % n;
            index++;
        }
        System.out.println(count);
    }
}