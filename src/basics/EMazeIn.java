package basics;

import java.util.Scanner;

public class EMazeIn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int stringLength = inputString.length(), horizontal = 0, vertical = 0;

        for (int i = 0; i < stringLength; i++) {
            switch (inputString.charAt(i)) {
                case 'L':
                    horizontal--;
                    break;
                case 'R':
                    horizontal++;
                    break;
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
            }
        }

        System.out.println(horizontal + " " + vertical);

    }
}
