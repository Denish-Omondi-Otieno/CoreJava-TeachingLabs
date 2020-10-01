package chapter_2;

// Listing 2.5 gives a program that converts a Fahrenheit degree to Celsius using the formula
// Celsius = (5/9) (fahrenheit-32)

import java.util.Scanner;

public class L025_FahrenheitToCelsius {
	
	public static void main (String [] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner (System.in);
		
		// Prompt the user for input
		System.out.println("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		double celsius = (5.0/9) * (fahrenheit - 32);
		
		////Display results
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}

}


/* Be careful when applying division. 
 * Division of two integers yields an integer in Java. 
 * 5/9 is translated to 5.0 / 9 instead of 5/9 in line 17, because 5/9 yields 0 in Java.
 */

//NOTES

// NUMERIC LITERALS

/* A literal is a constant value that appears directly in a program. 
 * For example, 34 and 0.305 are literals in the following statements:
 * int numberOfYears = 34;
 * double weight = 0.305;
 * 
 * INTEGER LITERALS
 * 
 * An integer literal can be assigned to an integer variable as long as it can fit into the variable.
 * A compile error will occur if the literal is too large for the variable to hold. 
 * The statement byte b = 128, for example, will cause a compile error, 
 * because 128 cannot be stored in a variable of the byte type.
 * 
 * To denote an integer literal of the long type, append the letter L or l to it (e.g., 2147483648L). 
 * L is preferred because l (lowercase L) can easily be confused with 1 (the digit one). 
 * To write integer 2147483648 in a Java program, you have to write it as 2147483648L, 
 * because 2147483648 exceeds the range for the int value.
 * 
 * By default, an integer literal is a decimal integer number (base 10 numbers)
 * 
 * FLOATING-POINT LITERALS
 * 
 * Floating-point literals are written with a decimal point. 
 * By default, a floating-point literal is treated as a double type value. 
 * For example, 5.0 is considered a double value, not a float value. 
 * You can make a number a float by appending the letter f or F, 
 * and you can make a number a double by appending the letter d or D. 
 * For example, you can use 100.2f or 100.2F for a float number, and 100.2d or 100.2D for a double number.
 * 
 * SCIENTIFIC NOTATION
 * 
 * Floating-point literals can also be specified in scientific notation; 
 * for example, 1.23456e+2, the same as 1.23456e2, is equivalent to (1.23456 * 10 power 2)=123.246
 * and 1.23456e-2 is equivalent to (1.23456 * 10 power -2) = 0.0123456. 
 * E (or e) represents an exponent and can be in either lowercase or uppercase.
 * 
 * The float and double types are used to represent numbers with a decimal point. 
 * Why are they called floating-point numbers? These numbers are stored in scientific notation. 
 * When a number such as 50.534 is converted into scientific notation, such as 5.0534e+1, 
 * its decimal point is moved (i.e., floated) to a new position.
 * 
 */


