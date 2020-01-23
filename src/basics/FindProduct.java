package basics;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long product = 1;
        int[] numArray = new int[number];
        int modulo = (int) Math.pow(10, 9) + 7;

        for (int i = 0; i < number; i++) {
            numArray[i] = scanner.nextInt();
            product = ((product % modulo) * (numArray[i] % modulo)) % modulo;

        }

        System.out.println(product);

    }
}
