package CoteStudy.Day18;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q059_11657 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n, m; // n 도시를 의미 / m 다른도시에 도착하는 버스
    static long distance[];
    static Edge edges[];

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        edges = new Edge[m + 1]; // 1번부터 하기위한 조건
        distance = new long[n + 1]; // 1번부터 하기위한 조건
        Arrays.fill(distance, Integer.MAX_VALUE); //최단 거리 배열 초기화하기

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            edges[i] = new Edge(start, end, time);
        }
        //벨만-포드 알고리즘 수행하기
        distance[1] = 0;
        for (int i = 1; i < n; i++) {       //N보다 1개 적은 수 만큼 반복하기 n -1
            for (int j = 0; j < m; j++) {
                Edge edge = edges[j]; // 1 3 3
                // 더 작은 최단 거리가 있을 때 업데이트하기
                if (distance[edge.start] != Integer.MAX_VALUE
                        && distance[edge.end] > distance[edge.start] + edge.time) {
                    distance[edge.end] = distance[edge.start] + edge.time;
                }
            }
        }
        boolean mCycle = false;

        for (int i = 0; i < m; i++) { //음수 사이클 확인하기
            Edge edge = edges[i];
            if (distance[edge.start] != Integer.MAX_VALUE
                    && distance[edge.end] > distance[edge.start] + edge.time) {
                mCycle = true;
            }
        }
        if (!mCycle) {                      //음의 사이클이 없을 때
            for (int i = 2; i <= n; i++) {
                if (distance[i] == Integer.MAX_VALUE)
                    System.out.println("-1");
                else
                    System.out.println(distance[i]);
            }
        } else {                        //음의 사이클이 있을 때
            System.out.println("-1");
        }
    }
}
    class Edge {
        int start, end, time;
        public Edge(int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }
    }

