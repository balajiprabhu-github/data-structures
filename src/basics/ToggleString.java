package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        for (int i = 0; i < text.length(); i++) {
            int temp = (int) text.charAt(i);
            if (temp >= 65 && temp <= 90) {
                System.out.print((char) (temp + 32));
            } else if (temp >= 97 && temp <= 122) {
                System.out.print((char) (temp - 32));
            }
        }

    }
}
