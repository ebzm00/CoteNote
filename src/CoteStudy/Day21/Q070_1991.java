package CoteStudy.Day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q070_1991 {
    static int[][] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        tree = new int[26][2];              // 0 -> 왼쪽 자식 노드 (1) -> 오른쪽 자식 노드 (2)
        for (int i = 0; i < n; i++) {
            //BufferedReader를 사용해 한 줄 읽고 split으로 나누기
            String[] temp = br.readLine().split(" ");
            int node = temp[0].charAt(0) - 'A'; // index로 변환하기 위해 A 문자 빼기
            char left = temp[1].charAt(0); // B
            char right = temp[2].charAt(0); // C

            //자식 노드가 없을 때  -1을 저장하기
            if (left == '.') {
                tree[node][0] = -1;
            } else {
               tree[node][0] = left - 'A'; // 1
            }
            if (right == '.') {
                tree[node][1] = -1;
            } else {
                tree[node][1] = right - 'A'; // 2
            }
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }



    public static void preOrder(int now) {
        if (now == -1)
            return;
        System.out.print((char) (now + 'A'));   //1. 현재 노드
        preOrder(tree[now][0]);                 //2. 왼쪽 탐색하기
        preOrder(tree[now][1]);                 //3. 오른쪽 탐색하기
    }

    private static void inOrder(int now) {
        if (now == -1)
            return;
        inOrder(tree[now][0]);                   //1. 왼쪽 탐색하기
        System.out.print((char) (now + 'A'));    //2. 현재 노드
        inOrder(tree[now][1]);                   //3. 오른쪽 탐색하기
    }
    public static void postOrder(int now) {
        if (now == -1)
            return;
        postOrder(tree[now][0]);                 // 1. 왼쪽 탐색하기
        postOrder(tree[now][1]);                 // 2. 오른쪽 탐색하기
        System.out.print((char) (now + 'A'));    // 3. 현재 노드
    }
}
