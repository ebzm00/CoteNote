package CoteStudy.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q000_2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.println(arr[i]);
        }

    }
}
