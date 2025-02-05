package Programmers;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
       s.solution("110010101001");
    }

    public int[] solution(String s) {
        int [] answer = {};
        int cnt = 0;
        int zero = 0;
        while (!s.equals("1")) {
            int length = s.length();
            s = s.replaceAll("0", "");
            zero += length - s.length(); // 0을 갖고있는 길이에서 0을 뺀 길이를 뺀다.
            s = Integer.toBinaryString(s.length());
            cnt++;
        }
        answer = new int[]{cnt, zero};

        return answer;
    }
}

