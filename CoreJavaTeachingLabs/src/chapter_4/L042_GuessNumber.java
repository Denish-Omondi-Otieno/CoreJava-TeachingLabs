package chapter_4;

import java.util.Scanner;

public class L042_GuessNumber {
	public static void main(String[] args) {

		// Generate a random number to be guessed
		int number = (int) (Math.random() * 101);

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		// introduce the loop
		int guess = -1;
		while (guess != number) {

			// Prompt the user to guess the number
			System.out.println("\n Enter your guess");
			guess = input.nextInt();

			if (guess == number) {
				System.out.println("Yes the number is " + number);
			} else if (guess > number) {
				System.out.println("Your guess is too high");
			} else {
				System.out.println("Your guess is too low");
			}

		}

	}

}

//NOTES

/* The program generates the magic number in line 9 and prompts the user to enter a guess continuously
in a loop (lines 17–31). 
* For each guess, the program checks whether the guess is correct, too high, or too low (lines 23–28). 
* When the guess is correct, the program exits the loop (line 17). 
* 
* Note that guess is initialized to -1. 
* Initializing it to a value between 0 and 100 would be wrong, because that could be the number to be guessed. */
