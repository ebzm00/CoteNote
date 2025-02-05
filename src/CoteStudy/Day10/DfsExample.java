package CoteStudy.Day10;

public class DfsExample {

    // 방문 처리에 사용할 배열 선언
    static boolean[] visited = new boolean[9];
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean firstNode = true; // 첫 노드 출력을 제어하는 플래그

    public static void main(String[] args) {
        dfs(1);
    }


    static void dfs (int nodeIndex) {
        //방문 처리
        visited[nodeIndex] = true;

        //방문 노드 출력
        if (firstNode) {
            //첫 번째 노드는 화살표 없이 출력
            System.out.print(nodeIndex);
            firstNode = false;
        } else {
            System.out.print(" -> " + nodeIndex);
        }



        //방문한 노드에 인접한 노드 찾기
        for (int node : graph[nodeIndex]) {
            //인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!visited[node]) {
                dfs(node);
            }
        }
    }
}
