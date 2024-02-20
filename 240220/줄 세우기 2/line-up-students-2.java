import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Student[] students = new Student[n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            
            students[i] = new Student(i, h, w);
        }

        Arrays.sort(students);

        for(Student s : students) {
            System.out.println(s.height+" "+s.weight+" "+(s.index+1));
        }
    }
}

class Student implements Comparable<Student> {
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
            return other.weight - this.weight;
        }
        return this.height - other.height;
    }
}