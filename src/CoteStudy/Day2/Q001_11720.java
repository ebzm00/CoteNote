package CoteStudy.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제 001 숫자의 합 구하기
public class Q001_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;

        for (int i=0; i < n; i++) {
            sum += Character.getNumericValue(numbers.charAt(i));
        }

        System.out.println(sum);

    }
}
