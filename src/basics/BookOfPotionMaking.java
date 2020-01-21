package basics;

import java.util.Scanner;

public class BookOfPotionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codeSum = 1;
        String code = scanner.nextLine();

        if (code.length() == 10) {
            codeSum = 0;
            for (int i = 0; i < code.length(); i++) {
                codeSum += code.charAt(i) * (i + 1);
            }
        }

        System.out.println((codeSum % 11 == 0) ? "Legal ISBN" : "Illegal ISBN");

    }
}
