package goormMission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_Mid05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(st.nextToken());
        StringBuilder s1 = sb.reverse();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            //소문자일 경우 대문자로
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
            //대문자일 경우 소문자로
            else if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        System.out.println("sb = " + sb );
    }
}
