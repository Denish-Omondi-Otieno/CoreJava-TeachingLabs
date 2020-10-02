package chapter_3;

import java.util.Scanner;

public class L037_TestBooleanOperators {
	public static void main (String [] args) {
		
		//Create a Scanner
		Scanner input = new Scanner (System.in);
		
		//Receive an input
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Is " + number +
								
				"\n\tdivisble by 2 and 3? " +
				(number % 2 == 0 && number % 3 == 0) // and
				+ "\n\tdivisble by 2 or 3? " +
				(number % 2 == 0 || number % 3 == 0) + // or
				"\n\tdivisble by 2 or 3, but not both?"
				+  (number % 2 == 0 ^ number % 3 == 0)); // exclusive or
	}

}

// NOTES

/* Listing 3.7 gives a program that checks whether a number 
 * is divisible by 2 and 3, 
 * by 2 or 3 and by 2 or 3 but not both:
 */

