package CoteStudy.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q007_1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 재료의 개수
        int m = Integer.parseInt(br.readLine()); // 갑옷이 완성되는 번호의 합

        int [] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int count = 0; // 갑옷이 완성되는 횟수
        int i = 0; // 시작지점
        int j = n-1; // 종료지점

        while (i < j) {                     // i = 0 / / j = 5 / m = 9
            if (a[i] + a[j] < m) {
                i++;
            } else if (a[i] + a[j] > m) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
