package Programmers.d7;
/* N개의 최소 공배수
문제 설명
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서,
n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

제한 사항
arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.*/
public class Solution1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        s.solution(new int[]{2,7});
    }


    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            //현재까지의 최소공배수와 현재 원소의 최대공약수 계산
            int gcd = gcd(answer,arr[i]);
            //최소공배수 갱신
            answer = answer * arr[i] / gcd;
        }
        return answer;
    }

    private static int gcd(int a, int b) {
        int x = Math.max(a,b);
        int y = Math.min(a,b);

        //나누어 떨어지지 않을 때까지 반복
        while(x % y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        return y;
    }
}
