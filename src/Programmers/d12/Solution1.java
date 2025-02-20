package Programmers.d12;

import java.util.Arrays;

//H-index
public class Solution1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        s.solution(new int[]{3, 0, 6, 1, 5});
    }

    public int solution(int[] citations) {
        int n = citations.length; // 논문 개수
        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            int h = (n - i); // 남은 논문 개수
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
