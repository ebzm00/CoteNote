package CoteStudy.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q016_1377 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 0 ;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int k = 1 + i; k < arr.length; k++) {
                if (arr[k] < arr[i]) {      // [0] = 10 / [1] = 1
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                    count++; // 자리 교환 시 증가
                }
            }
        }
        System.out.println(count);
    }
}

