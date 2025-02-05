package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        Triangle t = new Triangle();

          while ((str = br.readLine()) != null) {

              st = new StringTokenizer(str);
              int a = Integer.parseInt(st.nextToken());
              int b = Integer.parseInt(st.nextToken());
              int c = Integer.parseInt(st.nextToken());

              if (a == 0 && b == 0 && c == 0) {
                  break;
              }
              System.out.println(t.TriAngle(a, b, c));
        }
    }
}

    class Triangle {
        public String TriAngle(int a, int b, int c) {
            if ((a * a + b * b) == c * c) {
                return "right";
            } else if ((b * b + c * c) == a * a) {
                return "right";
            } else if ((c * c + a * a) == b * b) {
                return "right";
            }else{
                return "wrong";
            }
        }
    }


