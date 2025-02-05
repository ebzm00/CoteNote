package CoteStudy.Day2;

import java.util.Scanner;

public class Q003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //수의 개수 n과 합을 구해야하는 횟수 m
        int n = sc.nextInt();
        int m = sc.nextInt(); //질의 개수

        int[] arr = new int[n]; // 크기가 n의 숫자 배열 선언
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum; // 누적 변수 선언

        for (int i = 0; i < m; i++) { //m번 횟수만큼 질의 만큼 반복문
            sum = 0;
            int a = sc.nextInt(); // 구간 합을 구할 시작점 입력
            int b = sc.nextInt(); // 구간 합을 구할 종료점 입력
            for (int j = a -1; j < b; j++) { // 시작점부터 끝점까지 합을 구하기 위한 반복문
                sum += arr[j];
            }
            System.out.println(sum); // 구간 합 출력
        }

        sc.close();

    }
}
