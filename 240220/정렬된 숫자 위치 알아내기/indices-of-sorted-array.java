import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        MyClass[] classes = new MyClass[n];
        for(int i=0; i<n; i++) {
            classes[i] = new MyClass(i, Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(classes, (a, b) -> {
            if(a.value == b.value) {
                return a.index - b.index;
            }
            return a.value - b.value;
        });

        for(int i=0; i<n; i++) {
            classes[i].resultIndex = i;
        }

        Arrays.sort(classes, (a, b) -> a.index - b.index);

        for(MyClass c : classes) {
            System.out.print((c.resultIndex+1)+" ");
        }

    }
}

class MyClass {
    int index;
    int value;
    int resultIndex;

    MyClass(int index, int value) {
        this.index = index;
        this.value = value;
        this.resultIndex = -1;
    }
}