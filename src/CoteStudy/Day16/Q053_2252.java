package CoteStudy.Day16;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//줄 세우기
public class Q053_2252 {

    //노드 개수, 에지 개수 선언
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken()); // 노드
        int edge = Integer.parseInt(st.nextToken()); // 간선

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            A.add(new ArrayList<>()); //
        }
        int[] indegree = new int[node + 1]; // 1번부터

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 3
            int e = Integer.parseInt(st.nextToken()); // 1
            A.get(s).add(e);  // A [[] [] [] [1] [2]]
            indegree[e]++;  // indegree [] [1] [1] [] [] []
        }
        Queue<Integer> q = new LinkedList<>();  //위상 정렬 수행하기
        for (int i = 1; i <= node; i++) { // node = 4  // indegree[4] == 0
            if (indegree[i] == 0) {
                q.offer(i);  // q [3,4]
            }
        }
        while (!q.isEmpty()) { // q[1,2]
            int now = q.poll(); // 1
            System.out.print(now + " "); // 3, 4 , 1 ,2
            for (int next : A.get(now)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }
    }
}
