package basics;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt(), r = scanner.nextInt(), k = scanner.nextInt(), count = 0;

        for (int i = l; i <= r; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
