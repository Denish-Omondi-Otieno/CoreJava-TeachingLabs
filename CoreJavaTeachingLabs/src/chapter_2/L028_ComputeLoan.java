package chapter_2;

import java.util.Scanner;

public class L028_ComputeLoan {
	public static void main (String [] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner (System.in);
		
		// Enter yearly interest rate
		System.out.println("Enter the yearly interest rate");
		double annualInterestRate = input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate/1200;
		
		// Enter number of years
		System.out.println("Enter number of years as an interger, for example 2");
		int numberOfYears = input.nextInt();
		
		// Enter loan amount
		System.out.println("Enter loan amount for example 12345.67");
		double loanAmount = input.nextDouble();
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1-
				1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		//Display results
		System.out.println("The monthly payment is " +
		 (int)(monthlyPayment * 100) / 100.0);
		 System.out.println("The total payment is " +
		 (int)(totalPayment * 100) / 100.0);
		
	}

}

// NOTES

/* Line 113 reads the yearly interest rate, 
 * which is converted into monthly interest rate in line 16. 
 * If you entered an input other than a numeric value, a runtime error would occur. 
 * Choose the most appropriate data type for the variable. 
 * For example, numberOfYears is best declared as an int (line 20), 
 * although it could be declared as a long, float, or double.
 * Note that byte might be the most appropriate for numberOfYears. 
 * For simplicity, however,the examples in this book will use int for integer and double for floating-point values.
 * The formula for computing the monthly payment is translated into Java code in lines 27–30. 
 * Casting is used in lines 34 and 36 to obtain a new monthlyPayment and totalPayment
 * with two digits after the decimal point. 
 * The program uses the Scanner class, imported in line 3. 
 * The program also uses the Math class;
 * why isn’t it imported? The Math class is in the java.lang package. 
 * All classes in the java.lang package are implicitly imported. 
 * So, there is no need to explicitly import the Math class.
*/