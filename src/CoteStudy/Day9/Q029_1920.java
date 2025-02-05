package CoteStudy.Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q029_1920 {
    static int n;
    static int m;
    static ArrayList<Integer> a;
    static ArrayList<Integer> target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         a = new ArrayList<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st1.nextToken()));
        }

        Collections.sort(a); // ArrayList에 대한 정렬

        m = Integer.parseInt(br.readLine()); //찾아야 할 숫자 개수

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            boolean find = false;
            int target = Integer.parseInt(st2.nextToken());
            // 이진 탐색 시작
            int start = 0;
            int end = a.size() - 1;
            while (start <= end) {
                int midi = (start + end) / 2;
                int midv = a.get(midi);
                if (midv > target) {
                    end = midi - 1;
                } else if (midv < target) {
                    start = midi + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
