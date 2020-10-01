package chapter_2;

import java.util.Scanner;

public class L023a_ComputeAreaUsingConstantPi {
	public static void main (String [] args) {		
		final double PI = 3.14159; // Declare a constant
		
		// Create a Scanner object	
		Scanner input = new Scanner (System.in);
				
		// Prompt the user to enter the radius
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		
		// Compute Area		
		double area = (radius * radius) * PI;
		
		// Dispaly result
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}


//NOTES

//NAMED CONSTANTS

/*  The value of a variable may change during the execution of a program, 
 * but a named constant or simply constant represents permanent data that never changes. 
 * 
 * In our ComputeArea program, PI is a constant. 
 * If you use it frequently, you don’t want to keep typing 3.14159;
 * instead, you can declare a constant for PI.
 * 
 * Here is the syntax for declaring a constant:
 * 
 * final datatype CONSTANTNAME = VALUE; 
 * 
 * A constant must be declared and initialized in the same statement. 
 * The word final is a Java keyword for declaring a constant. 
 * 
 * Caution
 * By convention, constants are named in uppercase: PI, not pi or Pi.
 * 
 * Note
 * There are three benefits of using constants: 
 * (1) you don’t have to repeatedly type the same value;
 * (2) if you have to change the constant value (e.g., from 3.14 to 3.14159 for PI), 
 * you need to change it only in a single location in the source code; 
 * (3) a descriptive name for a constant makes the program easy to read.
 */