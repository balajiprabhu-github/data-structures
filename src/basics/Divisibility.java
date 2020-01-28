package basics;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(numbers[size - 1] % 10 == 0 ? "Yes" : "No");
    }
}
