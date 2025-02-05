package CoteStudy.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 표 크기
        int m = Integer.parseInt(st.nextToken()); // 쿼리 개수

        int[][] arr = new int[n + 1][n + 1]; //입력 배열 n * n
        int[][] dp = new int[n + 1][n + 1]; // 누적 합 배열

        //입력 받기 및 누적 합 배열 생성
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = arr[i][j] + dp [i - 1][j]
                        + dp[i][j - 1] - dp[i - 1][j -1];
            }
        }
    }
}
