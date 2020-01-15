package basics;

import java.util.Scanner;

public class Zoos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int zCount = 0,oCount = 0,wordLength = word.length();

        if(wordLength <= 20){
            for(int i=0;i < word.length();i++){
                if(word.charAt(i)== 'z'){
                    zCount++;
                } else if (word.charAt(i) == 'o') {
                    oCount++;
                }
            }
        }

        System.out.println((zCount*2) == oCount ? "Yes" : "No");

    }
}
