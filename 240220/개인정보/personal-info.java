import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person[] persons = new Person[5];
        StringTokenizer st;
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            persons[i] = new Person(name, height, weight);
        }

        Arrays.sort(persons, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        printResult(persons);
        System.out.println();

        Arrays.sort(persons, (a, b) -> b.height - a.height);
        System.out.println("height");
        printResult(persons);
    }

    public static void printResult(Person[] persons) {
        for(Person p : persons) {
            System.out.println(p.name+" "+p.height+" "+p.weight);
        }
    }
}

class Person {
    String name;
    int height;
    double weight;

    Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}