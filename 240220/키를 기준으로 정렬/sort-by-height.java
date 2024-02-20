import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Member[] members = new Member[n];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            members[i] = new Member(name, height, weight);
        }

        Arrays.sort(members);

        for(Member m : members) {
            System.out.println(m.name + " "+m.height+" "+m.weight);
        }

    }
}

class Member implements Comparable<Member> {
    String name;
    int height;
    int weight;

    Member(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Member other) {
        return this.height - other.height;
    }

}