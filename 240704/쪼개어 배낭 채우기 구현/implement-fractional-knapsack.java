import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Jewel> jewels = new ArrayList<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            double w = Double.parseDouble(st.nextToken());
            double v = Double.parseDouble(st.nextToken());
            jewels.add(new Jewel(w, v));
        }

        Collections.sort(jewels);

        double totalValue = 0;
        int totalWeight = 0;

        for(Jewel j : jewels) {
            totalValue += j.value;
            totalWeight += j.weight;

            if(totalWeight > m) {
                totalValue -= j.value;
                totalWeight -= j.weight;
                totalValue += j.realValue * (m-totalWeight);
                break;
            }
        }
        System.out.printf("%.3f", totalValue);
    }
}

class Jewel implements Comparable<Jewel> {
    double weight;
    double value;
    double realValue;

    Jewel(double w, double v) {
        this.weight = w;
        this.value = v;
        this.realValue = v/w;
    }

    @Override
    public int compareTo(Jewel o) {
        if(o.realValue < this.realValue) {
            return -1;
        }
        return 1;
    }
}