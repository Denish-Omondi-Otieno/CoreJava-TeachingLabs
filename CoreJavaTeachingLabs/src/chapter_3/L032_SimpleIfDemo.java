package chapter_3;

import java.util.Scanner;

public class L032_SimpleIfDemo {
	public static void main (String [] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner (System.in);
		
		//Receive the input
		System.out.println("Enter an interger: ");
		int number = input.nextInt();
		
		if (number % 5 == 0) {
			System.out.println("HiFive");
			
			if (number % 2 == 0) {
				System.out.println("HiEven");
			}
		}
	}

}

//NOTES

/* Listing 3.2 gives a program that prompts the user to enter an integer. 
 * If the number is a multiple of 5, print HiFive.
 * If the number is divisible by 2, print HiEven.
 * 
 * The program prompts the user to enter an integer (line 13) 
 * and displays HiFive if it is divisible by 5 (lines 15–16) 
 * and HiEven if it is divisible by 2 (lines 18–19).
 * 
 * Try using input 4 and input 30
*/