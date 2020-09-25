//Mini Project 1
//Group 9:  Suraj Shah, Tiernan Hull, Lou Rahm
//Date: 9/29/2020

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    Scanner g = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number: ");
    int userNum = i.nextInt();
    int randomNum = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated");
    
    playGame(randomNum, userNum);

    int guess = g.nextInt();
    int guessCount = 1;

    while (guess != randomNum){
      if (guess > randomNum) {
        System.out.println("Guess Lower!");

      }
      else if (guess < randomNum){
        System.out.println("Guess Higher!");
       
      }
      System.out.println("Enter your new guess: ");
      guess = g.nextInt();
      guessCount++;
      
    }
    System.out.println("Great, you win!  It took you " + guessCount + " tries.");
  }

  static void playGame(int theRandomNum, int theUserNum) {
    System.out.println("Please guess a number between 0 and " + theUserNum);
  }
}

