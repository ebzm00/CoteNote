package CoteStudy.Day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q077_11051 {
    static int n,k;
    static int D[][];
    static final int MOD = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        D = new int[n+1][n+1];

        // 초기화
        for(int i = 0; i<= n; i++) {
            D[i][1] = i;
            D[i][0] = 1;
            D[i][i] = 1;
        }

        //점화식으로 배열 완성하기
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                D[i][j] = (D[i-1][j] + D[i - 1][j - 1]) % MOD; //조합 점화식
            }
        }
        System.out.println(D[n][k]);
    }
}
