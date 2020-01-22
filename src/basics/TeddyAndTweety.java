package basics;

import java.util.Scanner;

public class TeddyAndTweety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), result = 0, divider;

        if (number % 3 == 0) {
            divider = number / 3;
            result = divider + divider + divider;
        }

        System.out.println((result == number) ? "YES" : "NO");
    }
}
