package basics;

import java.util.Scanner;

public class CharSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i);
            sum = sum + (temp - 96);
        }
        System.out.println(sum);
    }
}
