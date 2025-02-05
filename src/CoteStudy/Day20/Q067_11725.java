package CoteStudy.Day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q067_11725 {
    static int n;
    static boolean[] visited;
    static ArrayList<Integer> tree[];
    static int answer[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        answer = new int[n + 1];
        tree = new ArrayList[n + 1];

        for (int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            tree[n1].add(n2);
            tree[n2].add(n1);
        }

        //BFS를 위한 큐
        Queue<Integer> queue = new LinkedList<>();
        //루트 노드인 1을 큐에 넣고 방문 처리
        queue.add(1);
        visited[1] = true;
        //BFS
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            //현재 노드에 연결된 다음 노드들을 탐색
            for (int next : tree[cur]) {
                if (visited[next]) {
                    continue;
                }
                // 다음 노드를 방문 처리하고 큐에 넣는다.
                visited[next] = true;
                queue.add(next);
                // 다음 노드의 부모가 현재 노드임을 저장한다.
                answer[next] = cur;
            }
        }
        //부모 노드를 출력한다.
        for (int i = 2; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }
}
