import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Person[] persons = new Person[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            persons[i] = new Person(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Person before = persons[0];
        int index = 0;
        for(int i = 1; i<n; i++) {
            if(persons[i].name.compareTo(before.name) > 0) {
                before = persons[i];
                index = i;
            }
        }
        System.out.println("name "+persons[index].name);
        System.out.println("addr "+persons[index].address);
        System.out.println("city "+persons[index].location);
    }
}

class Person {
    String name;
    String address;
    String location;

    Person(String name, String address, String location){
        this.name = name;
        this.address = address;
        this.location = location;
    }
}