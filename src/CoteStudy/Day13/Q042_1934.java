package CoteStudy.Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최소 공배수 구하기
public class Q042_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a * b / gcd(a,b));

        }
    }


    public static int gcd (int a , int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b); // 재귀 함수의 형태로 구현
    }
}

