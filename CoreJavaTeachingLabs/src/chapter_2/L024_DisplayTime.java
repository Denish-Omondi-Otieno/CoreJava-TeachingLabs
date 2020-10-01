package chapter_2;

/* Listing 2.4 gives a program that obtains minutes and remaining seconds 
 * from an amount of time in seconds. 
 * For example, 500 seconds contains 8 minutes and 20 seconds.
 */

import java.util.Scanner;

public class L024_DisplayTime {	
	public static void main (String [] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner (System.in);
		
		// Prompt the user for input
		System.out.println("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		//Find minutes in seconds
		int minutes = seconds / 60;
		
		//Seconds remaining
		int remainingSeconds = seconds % 60;
		
		//Display results		
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
		
	}

}

/* The nextInt() method (line 18) reads an integer for seconds. 
 * Line 21 obtains the minutes using seconds / 60. 
 * Line 24 (seconds % 60) obtains the remaining seconds after taking away the minutes.
 */

//NOTES

//NUMERIC DATA TYPES AND OPERATIONS

/* Every data type has a range of values. 
 * The compiler allocates memory space for each variable or constant according to its data type. 
 * Java provides eight primitive data types for numeric values, characters, and Boolean values. 
 * This section introduces numeric data types.
 * 
 * Table 2.2 lists the six numeric data types, their ranges, and their storage sizes.
 * 
 * Name                 Range                   Storage Size
 * byte                                         8-bit signed
 * short                                        16-bit signed
 * int                                          34-bit signed
 * long                                         64-bit signed
 * float
 * double
 * 
 * Java uses four types for integers: 
 * byte, short, int, and long. 
 * 
 * Choose the type that is most appropriate for your variable. 
 * For example, if you know an integer stored in a variable is
 * within a range of byte, declare the variable as a byte. 
 * 
 * Java uses two types for floating-point numbers: float and double. 
 * The double type is twice as big as float. 
 * So, the double is known as double precision, float as single precision.
 * Normally you should use the double type, because it is more accurate than the float type.
 * 
 * Caution
 * When a variable is assigned a value that is too large (in size) to be stored, it causes overflow. 
 * Java does not report warnings or errors on overflow. 
 * So be careful when working with numbers close to the maximum or minimum range of a given type.
 * 
 * When a floating-point number is too small (i.e., too close to zero) to be stored, 
 * it causes underflow. Java approximates it to zero.
 * 
 */

 //  NUMERIC OPERATORS

/* The operators for numeric data types include the standard arithmetic operators: 
 * addition (+), subtraction (–), multiplication (*), division (/), and remainder (%),
 * 
 * When both operands of a division are integers, the result of the division is an integer. 
 * The fractional part is truncated. 
 * 
 * For example, 5 / 2 yields 2, not 2.5, and –5 / 2 yields -2, not –2.5. 
 * To perform regular mathematical division, one of the operands must be a floating-point number. 
 * For example, 5.0 / 2 yields 2.5.
 * 
 * The % operator yields the remainder after division. 
 * (7 % 3) in this: 7 is the dividend and 3 is the divisor.
 * The left-hand operand is the dividend and the right-hand operand the divisor. 
 * Therefore, 7 % 3 yields 1, 12 % 4 yields 0, 26 % 8 yields 2, and 20 % 13 yields 7.
 * 
 * The % operator is often used for positive integers 
 * but can be used also with negative integers and floating-point values. 
 * The remainder is negative only if the dividend is negative. 
 * 
 * For example, -7 % 3 yields -1, -12 % 4 yields 0, -26 % -8 yields -2, and 20 % -13 yields 7.
 * 
 * Remainder is very useful in programming. 
 * For example, an even number % 2 is always 0 and an odd number % 2 is always 1.
 * 
 * The + and - operators can be both unary and binary. 
 * A unary operator has only one operand; 
 * a binary operator has two. 
 * 
 * For example, the - operator in -5 is a unary operator to negate number 5, 
 * whereas the - operator in 4-5 is a binary operator for subtracting 5 from 4.
 *  
 * Note
 * 
 * Calculations involving floating-point numbers are approximated 
 * because these numbers are not stored with complete accuracy. 
 * 
 * For example, 
 * 
 * System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
 * displays 0.5000000000000001, not 0.5, and 
 * 
 * System.out.println(1.0 - 0.9); displays 0.09999999999999998, not 0.1. 
 * 
 * Integers are stored precisely. Therefore, calculations with integers yield a precise integer result.
 * */


 
