import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        List<Weather> weathers = new ArrayList<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String day = st.nextToken();
            String value = st.nextToken();
            
            if(value.equals("Rain")) {
                weathers.add(new Weather(date, day, value));
            }
        }

        int lastIndex = 0;
        for(int i=1; i<weathers.size(); i++){
            if(weathers.get(i).date.compareTo(weathers.get(lastIndex).date) < 0 ) {
                lastIndex = i;
            }
        }

        System.out.println(weathers.get(lastIndex).date+" "+weathers.get(lastIndex).day+" "+weathers.get(lastIndex).value);
    }

}

class Weather {
    String day;
    String value;
    String date;

    Weather(String date, String day, String value) {
        this.date = date;
        this.day = day;
        this.value = value;  
    }
}