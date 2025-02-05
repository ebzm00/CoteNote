package CoteStudy.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q002_1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int a[] = new int[cnt];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cnt; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0 ;
        long max = 0 ;
        for(int i = 0; i < cnt; i++) {
            if (a[i] > max) max = a[i];
            sum += a[i];
        }

        System.out.println(sum * 100.0 / max / cnt);
    }
}
