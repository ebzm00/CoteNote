package CoteStudy.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q006_2018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 사용하는 자연수
        int count = 1;
        int st_idx = 1;  // 시작점
        int end_idx = 1; // 종료점
        int sum = 1;

        // 입력된 수보다 끝지점이 크면 종료
       while (end_idx != n) {
           if (sum == n) {
               end_idx++;
               sum = sum + end_idx;
               count ++;
           } else if (sum > n) {
               sum = sum - st_idx;
               st_idx++;
           } else {
               end_idx++;
               sum = sum + end_idx;
           }
       }
        System.out.println(count);
    }
}
