package chapter_3;

import java.util.Scanner;

public class L035_ComputeBMI {
	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight in pounds
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		// Prompt the user to enter height in inches
		System.out.println("Enter height in inches");
		double height = input.nextDouble();
		
		// Constants are declared
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// Display result
		System.out.printf("Your BMI is %5.2f\n", bmi);
		if (bmi < 16) {
			System.out.println("You are seriously underweight");
		}
		else if (bmi < 18) {
			System.out.println("You are underweight");
		}
		else if (bmi < 24) {
			System.out.println(" You are normal weight");
		}
		else if (bmi < 29) {
			System.out.println("You are overweight");
		}
		else if (bmi < 35) {
			System.out.println(" You are seriously overweight");
		}
		else {
			System.out.println("You are gravely overweight");
		}
		
	}

}

//NOTES

/* Write a program that prompts the user to enter a weight in pounds and height in inches 
 * and display the BMI. 
 * Note that one pound is 0.45359237 kilograms 
 * and one inch is 0.0254 meters. 
 * 
 * Listing 3.5 gives the program.
 * 
 * Two constants KILOGRAMS_PER_POUND and METERS_PER_INCH are defined in lines 20-21. 
 * Using constants here makes programs easy to read.
 */

