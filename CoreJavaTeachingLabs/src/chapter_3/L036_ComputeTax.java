package chapter_3;

import java.util.Scanner;

public class L036_ComputeTax {
	public static void main(String[] args) {

		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter filing status
		System.out.println("0-single filer.\n" + "1-married jointly.\n" + "2-married separately.\n" + "3-head of household.\n" + "Enter the filing status: ");
		int status = input.nextInt();
		
		//Prompt the user to enter taxable income
		System.out.println("Enter the texable income: ");
		double income = input.nextDouble();
		
		//Compute Tax 
		
	}

}
