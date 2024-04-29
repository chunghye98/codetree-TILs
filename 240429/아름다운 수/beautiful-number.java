import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int count;
    static ArrayList<Integer> seq = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        solve(0);

        System.out.println(count);
    }

    public static void solve(int num) {
        if(num == n) {
            if(isBeautiful()) {
                count++;
            }
            return;
        }

        for(int i=1; i<=4; i++) {
            seq.add(i);
            solve(num+1);
            seq.remove(seq.size()-1);
        }
    }

    public static boolean isBeautiful() {
        for(int i=0; i<n; i+=seq.get(i)) {
            if(i + seq.get(i) - 1 >= n) {
                return false;
            }
            for(int j=i; j<i+seq.get(i); j++) {
                if(seq.get(j) != seq.get(i)){
                    return false;
                }
            }
        }
        return true;
    }
}