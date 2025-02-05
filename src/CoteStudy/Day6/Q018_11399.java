package CoteStudy.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q018_11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 줄을 서 있는 사람의 수
        int [] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(arr);


        int prev =  0;
        int sum = 0;

        for (int i = 0; i < n; i++){ //
            //이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
            //sum = sum + prev + arr[i];
                                          /*   [1, 2, 3, 3, 4]
                                              [0] => 0 + 0 + 1 > 1
                                              [1] => 1 + 1 + 2 > 4
                                              [2] => 4 + 3 + 3 > 10
                                              [3] => 10 + 6 + 3 > 19
                                              [4] => 19 + 9 + 4 > 32
                                          */
            sum += prev + arr[i];


            //이전까지의 누적합에 현재 걸리는 시간을 더해준다.
            //prev = prev + arr[i];
            prev += arr[i];
        }
        System.out.println(sum);
    }
}
