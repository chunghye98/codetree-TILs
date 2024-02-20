import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Location[] locations = new Location[n];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            locations[i] = new Location(i, x, y);
        }

        Arrays.sort(locations);

        for(Location l : locations) {
            System.out.println(l.index+1);
        }
    }
}

class Location implements Comparable<Location> {
    int index;
    int x;
    int y;

    Location(int index, int x, int y) {
        this.index = index;
        this.x = x;
        this.y = y;
    }

    public int findDistance(Location l) {
        return Math.abs(0 - l.x) + Math.abs(0 - l.y);
    }

    @Override
    public int compareTo(Location other) {
        if(findDistance(this) == findDistance(other)) {
            return this.index - other.index;
        }

        return findDistance(this) - findDistance(other);
    }
}