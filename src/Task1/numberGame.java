package Task1;

import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t---------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tWelcome to Number Guessing Game.....");
        System.out.println("\t\t\t\t\t\t\t\t---------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tDeveloped by Devesh Rawat");
        System.out.println("\t\t\t\t\t\t\t\t---------------------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int roundsWon=0;
        boolean playGame=true;
        while (playGame){
            int attempts=0;
            int maxAttempts=10;
            boolean wonGame=false;
            int numToGuess=ran.nextInt(100)+1;
            System.out.println("Guess a Number between 1 and 100.You have 10 attempts.");
            while (attempts++<maxAttempts){
                System.out.println("Guess a Number : ");
                int userGuess=sc.nextInt();
                if(userGuess<numToGuess){
                    System.out.println("Too Low!");
                }else if(userGuess>numToGuess){
                    System.out.println("Too High!");
                }else{
                    System.out.println("Congratulations...You have Guessed the correct Number.");
                    roundsWon++;
                    wonGame=true;
                    break;
                }
            }
            if (!wonGame) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + numToGuess);
            }

            System.out.println("You have won " + roundsWon + " rounds.");

            System.out.print("Do you want to play again? (yes/no): ");
            sc.nextLine();
            String response = sc.nextLine();
            playGame = response.equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing! You won " + roundsWon + " rounds.");
        sc.close();

    }

    }

