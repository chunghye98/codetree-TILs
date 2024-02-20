import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Person[] persons = new Person[n];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            persons[i] = new Person(name, height, weight);
        }

        Arrays.sort(persons);

        for(Person p : persons) {
            System.out.println(p.name+" "+p.height+" "+p.weight);
        }
    }
}

class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person other) {
        if(this.height == other.height){
            return other.weight - this.weight;
        }
        return this.height - other.height;
    }

}