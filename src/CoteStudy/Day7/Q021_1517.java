package CoteStudy.Day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q021_1517 {
    public static int[] number;
    public static int[] temp;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        number = new int[n];
        temp = new int[number.length];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(0, number.length - 1, number); //병합 정렬 시작

        System.out.println(result);
    }

    public static void merge(int left, int mid, int right, int[] number) {
        int p = left;
        int q = mid + 1;
        int k = left;

        // 두 부분을 병합
        while (p <= mid && q <= right) {
            if (number[p] > number[q]) {
                temp[k++] = number[q++];
                result = result + q - k;
            } else {
                temp[k++] = number[p++];
            }
        }

        // 남은 요소 처리
        while (p <= mid) {
            temp[k++] = number[p++];
        }
        while (q <= right) {
            temp[k++] = number[q++];
        }

        // 정렬된 결과를 원래 배열에 복사
        for (int i = left; i <= right; i++) {
            number[i] = temp[i];
        }
    }

    public static void mergeSort(int left, int right, int[] number) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(left, mid, number);
            mergeSort(mid + 1, right, number);
            merge(left, mid, right, number); // 올바르게 호출
        }
    }
}

