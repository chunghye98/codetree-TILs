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
        Person result = null;
        for(int i = 1; i<n; i++) {
            if(isNext(before, persons[i])) {
                before = persons[i];
                result = persons[i];
            }
        }
        System.out.println("name "+result.name);
        System.out.println("addr "+result.address);
        System.out.println("city "+result.location);
    }

    public static boolean isNext(Person before, Person current) {
        char[] beforeName = before.name.toCharArray();
        char[] currentName = current.name.toCharArray();

        for(int i=0; i<beforeName.length; i++) {
            if(beforeName[i] < currentName[i]) {
                return true;
            }
        }
        return false;
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