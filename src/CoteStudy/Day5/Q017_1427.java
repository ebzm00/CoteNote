package CoteStudy.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q017_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] num = str.split("");
        int arr[] = new int [num.length];

        for (int i = 0; i < num.length; i++) {
            arr[i] = Integer.parseInt(num[i]);
        }
        // 2143
        Arrays.sort(arr); // 입력받은 숫자 오름차순으로 정렬
        // 1234

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        //4321
    }
}