package BaekJoon;

import java.io.*;

public class Q14681 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0) {
            bw.write("1");
            bw.flush();
        } else if (x < 0 && y > 0) {
            bw.write("2");
            bw.flush();
        } else if (x < 0 && y < 0) {
            bw.write("3");
            bw.flush();
        } else {
            bw.write("4");
            bw.flush();
            bw.close();
        }

    }
}
