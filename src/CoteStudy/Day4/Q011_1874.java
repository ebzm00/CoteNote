package CoteStudy.Day4;

import java.io.*;
import java.util.Stack;

//스택 사용법
public class Q011_1874 {
    //수열의 개수 8개
        /*   top : 삽입과 삭제가 일어나는 위치를 뜻한다.
             push : top 위치에 새로운 데이터를 삽입하는 연산이다.
             pop : top 위치에 현재 있는 데이터를 삭제하고 확인하는 연산이다.
             peek : top 위치에 현재 있는 데이터를 단순 확인하는 연산이다.
         */
    //[4, 3, 6, 8, 7, 5, 2, 1]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 수열의 자연수
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int last_value = 0;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > last_value) {
                for(int j = last_value + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                last_value = value;  // last_value = 6;
            } else {
                if (stack.peek() != value) {
                    bw.write("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
