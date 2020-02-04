package basics;

import java.util.Scanner;

public class AMovement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), n = 0;

        while (num > 0) {
            num = num - 5;
            n++;
        }

        System.out.println(n);

    }
}
