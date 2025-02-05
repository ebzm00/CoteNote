package CoteStudy.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q023_11724 {

    static int n; // 노드 개수
    static int m; // 에지 개수
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 노드 개수
        m = Integer.parseInt(st.nextToken()); // 에지 개수
        visited = new boolean[n+1];
        A = new ArrayList[n+1];
        for (int i = 1; i < n+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) { // 에지정보란 => 몇줄이 나오는건지에 대한 정보
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작점
            int e = Integer.parseInt(st.nextToken()); // 종료점
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0; // 연결 요소 개수를 담을 변수
        for (int i = 1; i < n+1; i++) {
            if(!visited[i]) { // 방문하지 않은 노드
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) { //탐색하지 않은 노드가 있다면 그 기준으로 다시 실행 => 재귀함수
                dfs(i);
            }
        }
    }
}
