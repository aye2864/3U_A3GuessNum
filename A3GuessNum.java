/*
 *Name: elif
 *Date: 23/11//21
 *Description: random number finding game
 */

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class A3GuessNum {

    //main method
    public static void main(String[] arg) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        int playAgain;

        int guess;
        int random;
        int range = 100;

        do {
            System.out.printf("Guess a number between 1 and 100", range);

            random = gen.nextInt(range) + 1;

            do {
                guess = input.nextInt();

                if (guess == random) {
                    System.out.println("Correct!");
                  } else if (guess < 1) {
                    System.out.println("Too low!");
                } else if (guess > 100) {
                    System.out.println("Too high!");
                } else {
                    int distance = Math.abs(random - guess);
                    
                if (guess < random){
                  System.out.println("Too low!");
                }
                else if(guess > random){
            System.out.println("Too high!");
                }
                    if (distance > 50) {
                        System.out.println("Freezing");
                    } else if (distance > 25) {
                        System.out.println("Cold");
                    } else if (distance > 10) {
                        System.out.println("Warm");
                    } else {
                        System.out.println("Hot");
                    }
                }
            } while (guess != random);

            do {
                System.out.println("Do you want to play again? ([Y]es/[N]o)");
                String answer = input.nextLine().trim().toLowerCase(Locale.ROOT);

                playAgain = 0;

                if (answer.equals("y") || answer.equals("yes")) {
                    playAgain = 1;
                }

                if (answer.equals("n") || answer.equals("no")) {
                    playAgain = 2;
                }
            } while (playAgain == 0);

            range = gen.nextInt(50) + 50;
        } while (playAgain == 1);

        System.out.println("It was fun playing with you");
        System.out.println("Have a nice day");
    }
}