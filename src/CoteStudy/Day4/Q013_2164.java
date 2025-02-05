package CoteStudy.Day4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Q013_2164 {

    /*
    *  1 ~ N 까지의 번호가 붙어 있으며, 1번 카드가 가장 위, N번 카드가 가장 아래인 상태로 놓여있다.
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); //
        Queue<Integer> q = new LinkedList<>();

        // 선입 선출
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

            while (q.size() > 1) {
                q.poll();  // 가장위의 카드를 버리기
                q.add(q.poll()); //맨 위의 카드를 가장 아래의 카드 밑으로 이동
            }

        bw.write(String.valueOf(q.poll()));
        bw.flush();
        bw.close();

    }
}
