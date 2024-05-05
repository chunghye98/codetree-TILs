import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<Line> lines = new ArrayList<>();

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            lines.add(new Line(a, b));
        }

        Collections.sort(lines);

        int end = 0;
        int count = 0;
        for(int i=0; i<lines.size(); i++) {
            Line line = lines.get(i);
            if(line.a >= end) {
                end = line.b;
                count++;
            }
        }
        System.out.println(count);
    }
}

class Line implements Comparable<Line> {
    int a;
    int b;

    Line(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Line o) {
        if(this.b == o.b) {
            return o.a - this.a;
        }
        return this.b - o.b;
    }
}