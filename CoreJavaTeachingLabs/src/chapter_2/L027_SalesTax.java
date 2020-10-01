package chapter_2;

//Listing 2.7 gives a program that displays the sales tax with two digits after the decimal point.

import java.util.Scanner;

public class L027_SalesTax {

	public static void main (String [] args) {
		
		//Create a Scanner Object
		Scanner input = new Scanner (System.in);
		
		//Prompt user for input
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		//Compute the tax
		double tax = purchaseAmount * 0.06;
		System.out.println(tax);
		
		//Casting double into an int
		System.out.println("The Casted Sales tax is " + (int)tax);
	}
}

//NOTES

/* Variable purchaseAmount is 197.55 (line 16). 
 * The sales tax is 6% of the purchase, so the
 * tax is evaluated as 11.853 (line 20).
 * 
 * Casting occurs in line 23 where a double is being casted into an int
 * 
 */