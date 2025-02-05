package CoteStudy.Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 1717번 집합 표현하기
    static int[] parent;
    static void union(int n1, int n2) {
        int a = find(n1);
        int b = find(n2);
        if (a > b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
    static int find (int k) {
        if(parent[k] != k) {
            parent[k] = find(parent[k]);
        }
        return parent[k];
    }

    static boolean connected(int n1, int n2) {
        return find(n1) == find(n2);
    }

    //메인 함수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //원소 개수
        int m = Integer.parseInt(st.nextToken()); //질의 개수
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            if (command == 0) {
                union(n1, n2);
            } else if (command == 1) {
                if (connected(n1, n2)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.println(sb);
    }
}
