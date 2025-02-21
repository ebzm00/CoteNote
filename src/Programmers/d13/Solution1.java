package Programmers.d13;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        s.solution(new int[] {93,30,55},new int[] {1, 30, 5});
    }

    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        //각 기능의 배포까지 필요한 날짜를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingWork / speeds[i]); // => 7, 3, 9
            queue.offer(days);
        }

        while (!queue.isEmpty()) {
            int deployDay = queue.poll(); //첫 번째 기능의 배포일
            int count = 1;

            //현재 배포일에 함께 배포될 수 있는 기능 확인
            while(!queue.isEmpty() && queue.peek() <= deployDay) { // => 3 <= 7
                queue.poll();
                count++; // 2
            }

            result.add(count);
        }
        // 리스트를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
