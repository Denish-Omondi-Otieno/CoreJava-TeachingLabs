package chapter_3;

import java.util.Scanner;

public class L039_LotteryJava {
	public static void main(String[] args) {

		// Generate a lottery
		int lottery = (int) (Math.random() * 100);

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();

		// Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;

		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lottery);

		// Check the guess
		if (guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		} else if (guessDigit2 == lotteryDigit1 
				&& guessDigit1 == lotteryDigit2) {
			System.out.println("Match all digits:  you win $3,000");
		} else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: you win $1,000");
		}
		else {
			System.out.println("Sorry, no match");
		}
	}

}

//NOTES

/* 
 * The program generates a lottery using the random() method (line 9) and prompts the user 
 * to enter a guess (line 14). 
 * 
 * Note that guess % 10 obtains the last digit from guess and guess / 10 obtains the first digit from guess, 
 * since guess is a two-digit number (lines 21–22).
 * 
 * The program checks the guess against the lottery number in this order:
 * 
 * 1. First check whether the guess matches the lottery exactly (line 27).
 * 2. If not, check whether the reversal of the guess matches the lottery (lines 29–30).
 * 3. If not, check whether one digit is in the lottery (lines 32–35).
 * 4. If not, nothing matches.
 * */
