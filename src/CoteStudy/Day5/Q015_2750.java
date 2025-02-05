package CoteStudy.Day5;

import java.io.*;


public class Q015_2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }  // 5 2 3 4 1

        for (int i = 0; i < arr.length; i++) {     // 5
            for (int j = i + 1; j <arr.length; j++) { // 2
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }
}
