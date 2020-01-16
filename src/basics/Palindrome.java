package basics;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int wordLength = word.length();
        boolean isPalindrome = false;

        for (int i = 0; i < wordLength; i++) {
            isPalindrome = word.charAt(i) == word.charAt((wordLength - 1) - i);
        }

        System.out.println(isPalindrome ? "YES" : "NO");

    }
}
