package CoteStudy.Day13;

import java.io.*;
import java.util.StringTokenizer;

public class Q043_1850 {

    //최대 공약수 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long result = gcd(a,b);

        while (result > 0 ) {
            bw.write("1");
            result --;
        }
        bw.flush();
        bw.close();
    }

    //최대 공약수 gcd() 함수 구현하기
    public static long gcd(long a, long b) {
        if(b == 0)
            return a;
            else
                return gcd(b, a % b);
    }
}
