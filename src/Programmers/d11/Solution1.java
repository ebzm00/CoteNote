package Programmers.d11;

/* 행렬의 곱셈
 * 문제 설명
 * 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
 * 제한 조건
 * 행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
 * 행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
 * 곱할 수 있는 배열만 주어집니다.
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[][] result = s.solution(new int[][]{{1,4},{3,2},{4,1}}, new int[][]{{3,3},{3,3}});

        // 결과 출력
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowsA = arr1.length;    // 3
        int colsA = arr1[0].length; // 2
        int colsB = arr2[0].length; // 2

        // 결과 행렬 크기 : (3x2)
        int[][] answer = new int[rowsA][colsB];

        // 행렬 곱셈 수행
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    answer[i][j] = answer[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}



//