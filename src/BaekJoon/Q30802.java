package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] sizes = new int[6];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 정수 티셔츠
        int P = Integer.parseInt(st.nextToken()); // 펜의 묶음 수

        int tCnt = 0; //구매할 티셔츠 묶음 수
        for(int j = 0; j <sizes.length; j++) {
            tCnt += sizes[j] / T;
            if (sizes[j] % T != 0){ //딱 안 떨어지면 한 묶음 더 사야함
                tCnt += 1;
            }
        }
        System.out.println(tCnt);
        System.out.println(n/P + " " + n%P);
    }
}
