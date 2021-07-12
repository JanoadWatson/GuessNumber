package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        int randomNum = (int) (Math.random() *(20-1)) + 1;
        System.out.println(randomNum);

        System.out.println(" Hello! What is your Name ?");
        String name = input1.nextLine();
        int convertedChoice = 0;

        while (convertedChoice <1 || convertedChoice>20) {

            System.out.println(String.format("Well, %s I am thinking of a number between 1 and 20. Take a guess.", name));
            String Choice = input2.nextLine();
            convertedChoice = Integer.valueOf((String) Choice);

        }
        int count = 1;

        while (count <6) {

            if (convertedChoice == randomNum) {

                System.out.println(String.format("Good job, %s ! You guessed my number in %d guesses! Would you like to play again? (y or n)",name,count));
                        String playAgain = input3.nextLine();
                        if(playAgain.equals("n")){

                            System.out.println("Game Over!");
                            break;
                        }
                        else{
                            count = 1;
                            randomNum= (int) (Math.random() * (20-1)) + 1;
                            System.out.println(randomNum);
                            System.out.println(String.format("%s I am thinking of a number between 1 and 20. Take a guess.", name));

                        }
            } else if (convertedChoice < randomNum) {
                System.out.println("Your guess is to low. /n Take a guess");
            } else {
                System.out.println("Your guess is to high. /n Take a guess");
            }
            count++;
            String Choice = input2.nextLine();
            convertedChoice = Integer.valueOf((String) Choice);

        }
	// write your code here
    }
}
