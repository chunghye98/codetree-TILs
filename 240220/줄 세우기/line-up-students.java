import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int index = i+1;
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            students[i] = new Student(index, height, weight);
        }

        Arrays.sort(students);

        for(Student s : students) {
            System.out.println(s.height+" "+s.weight+" "+s.index);
        }
    }
}

class Student implements Comparable<Student>{
    int index;
    int height;
    int weight;

    Student(int index, int height, int weight) {
        this.index = index;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other) {
        if(this.height == other.height) {
            if(this.weight == other.weight) {
                return this.index - other.index;
            }
            return other.weight - this.weight;
        }
        return other.height - this.height;
    }
}