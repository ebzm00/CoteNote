package Programmers.d6;

/* 멀리 뛰기
 * 효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는
 * (1칸, 1칸, 1칸, 1칸)
 * (1칸, 2칸, 1칸)
 * (1칸, 1칸, 2칸)
 * (2칸, 1칸, 1칸)
 * (2칸, 2칸)
 * 의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다.
 * 멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내,
 * 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 예를 들어 4가 입력된다면, 5를 return하면 됩니다.
 * 제한 사항
 * n은 1 이상, 2000 이하인 정수입니다.
 */
public class Solution2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.solution(4); // 테스트를 위해 solution 메서드를 호출합니다.
    }

    public long solution(int n) {
        long answer = 0; // 결과를 저장할 변수입니다.
        long[] dp = new long[n + 1]; // 동적 프로그래밍을 위한 배열을 선언합니다.

        dp[0] = 1; // 0칸을 뛰는 방법은 1가지입니다.
        dp[1] = 1; // 1칸을 뛰는 방법은 1가지입니다.

        // 2칸 이상을 뛰는 방법을 계산합니다.
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567; // 이전 두 칸의 방법을 더한 후 1234567로 나눈 나머지를 저장합니다.
        }

        answer = dp[n]; // 최종 결과를 answer에 저장합니다.
        return answer; // 결과를 반환합니다.
    }
}