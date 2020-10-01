package chapter_2;

import javax.swing.JOptionPane;

public class L211_ComputeLoanUsingInputDialog {
	public static void main(String[] args) {

		// Enter yearly interest rate
		// It will be a string value since we are using the JOptionpane
		String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interet rate, for example 8.25: ");

		// Convert string to double using the parse method
		double annualInterestRate = Double.parseDouble(annualInterestRateString);

		// Obtain monthly interest rate
		double monthlyInterstRate = annualInterestRate / 1200;

		// Enter number of years
		String numberOfYearsString = JOptionPane
				.showInputDialog("Enter number of years as an integer, \nfor example 5.");

		// Convert string to int
		int numberOfYears = Integer.parseInt(numberOfYearsString);

		// Enter loan amount
		String loanString = JOptionPane.showInputDialog(" Enter loan amount, for example 120000.95");

		// Convert String to double
		double loanAmount = Double.parseDouble(loanString);

		// Calculate monthly payment
		double monthlyPayment = loanAmount * monthlyInterstRate
				/ (1 - 1 / Math.pow(1 + monthlyInterstRate, numberOfYears * 12));

		// Calculate totalPayment
		double totalPayment = monthlyPayment * numberOfYears * 12;

		// Format to keep two digits after the decimal point
		monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
		totalPayment = (int) (totalPayment * 100) / 100.0;

		// Display results
		String output = "The monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment;
		JOptionPane.showMessageDialog(null, output);
	}

}


// NOTES

/*  The showInputDialog method in lines 10 displays an input dialog. 
 * Enter the interest rate as a double value and click OK to accept the input. 
 * The value is returned as a string that is assigned to the String variable annualInterestRateString. 
 * The Double.parseDouble(annualInterestRateString) (line 13) is used to convert the string into a double value. 
 * If you entered an input other than a numeric value or clicked Cancel in the input dialog box, 
 * a runtime error would occur */