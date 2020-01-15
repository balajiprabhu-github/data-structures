package basics;

import java.util.Scanner;

public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        while(count != 0){
            int oppositeNumber = 0;
            int n = scanner.nextInt();
            if(n % 6 == 1 || n == 1 || n % 6 == 0){
                // Window seat
                if(n % 12 == 0 ){
                    oppositeNumber = n-11;
                }else if(n % 12 == 1){
                    oppositeNumber = n+11;
                }
                else if(n == 1){
                    oppositeNumber = 12;
                }else if(n % 6 == 0){
                    oppositeNumber = n+1;
                }else{
                    oppositeNumber = n-1;
                }
                System.out.println(oppositeNumber+" WS");

            }else if(n % 3 == 1 || n % 3 == 0){

                // Aisle Seat

                if(n % 4 == 0){
                    oppositeNumber = n+5;
                }else if(n % 3 == 0){
                    if((n+1) % 4 == 0){
                        oppositeNumber = n + 7;
                    }else{
                        oppositeNumber = n - 5;
                    }
                }else if(n % 2 == 0){
                    oppositeNumber = n - 7;
                }

                System.out.println(oppositeNumber+" AS");
            }else{
                // Middle seat
                if(n % 4 == 0){
                    oppositeNumber = n - 3;
                }else if(n % 4 == 1){
                    oppositeNumber = n + 3;
                }else if(n % 2 == 0){
                    oppositeNumber = n + 9;
                }else{
                    oppositeNumber = n - 9;
                }

                System.out.println(oppositeNumber+" MS");
            }
            count--;
        }
    }
}
