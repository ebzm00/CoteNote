package CoteStudy.Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q046_18352 {
    public static void main(String[] args) throws IOException {
        //1. BufferedReader와 StringTokenizer를 이용한 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2. 첫 번째 줄 입력 처리
        int N = Integer.parseInt(st.nextToken()); // 도시 개수
        int M = Integer.parseInt(st.nextToken()); // 도로 개수
        int K = Integer.parseInt(st.nextToken()); // 목표 거리
        int X = Integer.parseInt(st.nextToken()); // 출발 도시

        // 3. 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 4. 도로 정보 입력받기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(A).add(B);
            System.out.println("Graph: " + graph);
        }

        // 5. 거리 배열 초기화
        int [] distance = new int[N + 1];
        Arrays.fill(distance, -1); // 모든 도시는 미방문(-1) 상태
        distance[X] = 0; // 출발 도시의 거리는 0
        System.out.println("Initial Distance: " + Arrays.toString(distance));

        // 6. BFS를 위한 큐 초기화
        Queue<Integer> q = new LinkedList<>();
        q.add(X);

        // 7. BFS 시작
        while(!q.isEmpty()) {
            int current = q.poll(); //현재 도시 꺼내기
    //        System.out.println("Visiting City: " + current);
            // 현재 도시와 연결된 모든 도시 탐색
            for(int neighbor : graph.get(current)) {
                if (distance[neighbor] == -1) { // 아직 방문하지 않은 도시라면
                    distance[neighbor] = distance[current] + 1; // 거리 갱신
                //    System.out.println("Updating Distance: City " + neighbor + " -> " + distance[neighbor]);
                    q.add(neighbor); // 큐에 추가
            }
        }
    }

        // 8. 결과 저장
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            if (distance[i] == K) {
                result.add(i);
            }
        }

        // 9. 결과 출력
        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result); //오름차순 정렬
            for (Integer city : result) {
                System.out.println(city);
            }
        }
    //    System.out.println("Cities with Distance K: " + result);
    }
}
