package basics;

/*Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)*/

import java.util.Scanner;

public class AliAndHelpingInnocentPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tag = scanner.nextLine();
        int tagLength = tag.length();
        boolean isValidNumber = true, isValidAlpha = false;

        if (tagLength == 9) {
            for (int i = 0; i < tagLength; i++) {
                if (i == 0) {
                    isValidNumber = isEven(tag.charAt(i), tag.charAt(i + 1));
                } else if (i == 3 && isValidNumber) {
                    isValidNumber = isEven(tag.charAt(i), tag.charAt(i + 1));
                } else if (i == 4 && isValidNumber) {
                    isValidNumber = isEven(tag.charAt(i), tag.charAt(i + 1));
                } else if (i == 7 && isValidNumber) {
                    isValidNumber = isEven(tag.charAt(i), tag.charAt(i + 1));
                } else if (i == 2) {
                    isValidAlpha = isNotVowel(tag.charAt(i));
                }
            }
            System.out.println((isValidNumber && !isValidAlpha) ? "valid" : "invalid");
        } else {
            System.out.println("invalid");
        }

    }

    private static boolean isNotVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y');
    }

    private static boolean isEven(char a, char b) {
        return (a + b) % 2 == 0;
    }
}
