import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Student[] s = new Student[n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            s[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(s);

        for(Student value : s) {
            System.out.println(value.name+" "+value.kor+" "+value.eng+" "+value.math);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student other) {
        if(this.kor == other.kor) {
            if(this.eng == other.eng) {
                return other.math - this.math;
            }else if(this.eng > other.eng) {
                return -1;
            }else {
                return 1;
            }

        }else if(this.kor > other.kor){
            return -1;
        }else {
            return 1;
        }
    }
}