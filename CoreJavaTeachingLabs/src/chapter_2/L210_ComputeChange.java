package chapter_2;

import java.util.Scanner;

public class L210_ComputeChange {

	public static void main(String[] args) {

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		// Convert the amount into an int
		int remainingAmount = (int) (amount * 100);

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of \n" + "\t" + numberOfOneDollars + " dollars\n" + "\t"
				+ numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickels
				+ " nickels\n" + "\t" + numberOfPennies + " pennies");
		
		// \n Linefeed
		// \t Tab
	}
}

//NOTES

/* Suppose you want to develop a program that classifies a given amount of money into smaller monetary units. 
 * The program lets the user enter an amount as a double value representing a total in dollars and cents, 
 * and outputs a report listing the monetary equivalent in dollars, quarters, dimes, nickels, and pennies, 
 * as shown in the sample run.
 * 
 * Your program should report the maximum number of dollars, then the maximum number of quarters, and so on, in this order.
 * 
 *  // Here are the steps in developing the program:
 *  
1. Prompt the user to enter the amount as a decimal number, such as 11.56.
2. Convert the amount (e.g., 11.56) into cents (1156).
3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using
the cents remainder 100.
4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
cents using the remaining cents remainder 25.
5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining
cents using the remaining cents remainder 10.
6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining
cents using the remaining cents remainder 5.
7. The remaining cents are the pennies.
8. Display the result.
 *  
 *  */