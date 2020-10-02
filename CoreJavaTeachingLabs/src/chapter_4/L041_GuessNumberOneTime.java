package chapter_4;

import java.util.Scanner;

public class L041_GuessNumberOneTime {
	public static void main(String[] args) {

		// Generate a random number to be guessed
		int number = (int) (Math.random() * 101);

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		// introduce the loop
		while (true) {
			// Prompt the user to guess the number
			System.out.println("\nEnter your guess");
			int guess = input.nextInt();

			if (guess == number) {
				System.out.println("Yes, the number is " + number);
			} else if (guess > number) {
				System.out.println("Your guess is too high");
			} else {
				System.out.println("Your guess is too low");
			}
		} // end of loop

	}

}

// NOTES

/* This loop repeatedly prompts the user to enter a guess. However, this loop is not correct,
because it never terminates. When guess matches number, the loop should end. So, the loop
can be revised as follows:*/
