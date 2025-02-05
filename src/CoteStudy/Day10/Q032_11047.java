package CoteStudy.Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//동전 개수의 최솟값 구하기
public class Q032_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 동전 수
        int k = Integer.parseInt(st.nextToken()); // 목표 금액
        ArrayList<Integer> arr = new ArrayList<>(); // 동전 담을 배열


        for (int i = 0; i < n; i++) {
             arr.add(Integer.parseInt(br.readLine()));
        }

        int count = 0 ;
        for (int i = n - 1; i >= 0 ; i--) {
            if (arr.get(i) <= k) { //현재 동전의 가치가 K보다 작거나 같으면 구성에 추가
                count += (k / arr.get(i)); //4 + 2  => 6
                k = k % arr.get(i); // 200 => 0
            }
        }
        br.close();
        System.out.println(count);
    }
}
