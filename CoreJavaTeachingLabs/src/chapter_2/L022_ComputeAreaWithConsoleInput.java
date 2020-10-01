package chapter_2;

import java.util.Scanner; // Scanner is in the java.util package

public class L022_ComputeAreaWithConsoleInput {
	public static void main(String[] args) {

		//Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter a radius
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();

		//Compute area
		double area = radius * radius * 3.14159;

		//Display result
		System.out.println("The area for the circle of radius " + 
		radius + " is " + area);
	}

}


//NOTES

/* In Listing 2.1, the radius is fixed in the source code. 
 * To use a different radius, you have to modify the source code and recompile it. 
 * Obviously, this is not convenient. 
 * You can use the Scanner class for console input.
 * Java uses System.out to refer to the standard output device and System.in to the standard input device. 
 * By default the output device is the display monitor, and the input device is the keyboard.
 * 
 * To perform console output, you simply use the println method to display a primitive value or a string to the console. 
 * Console input is not directly supported in Java, but you can use the Scanner class to create an object to read input from System.in, as follows:
 * 
 * Scanner input = new Scanner(System.in);
 * 
 * The syntax: new Scanner(System.in) 
 * creates an object of the Scanner type. 
 * 
 * The syntax: Scanner input 
 * declares that input is a variable whose type is Scanner. 
 * 
 * The whole line: Scanner input = new Scanner(System.in) 
 * creates a Scanner object and assigns its reference to the variable input. 
 * 
 * An object may invoke its methods. 
 * To invoke a method on an object is to ask the object to perform a task. 
 * You can invoke the methods in Table 2.1 to read various types of input.
 * 
 * TABLE 2.1 Methods for Scanner Objects 
 * Method Description
 * 
 * nextByte() reads an integer of the byte type.
 * nextShort() reads an integer of the short type.
 * nextInt() reads an integer of the int type.
 * nextLong() reads an integer of the long type.
 * nextFloat() reads a number of the float type.
 * nextDouble() reads a number of the double type.
 * next() reads a string that ends before a whitespace character.
 * nextLine() reads a line of text (i.e., a string ending with the Enter key pressed).
 * 
 * For now, we will see how to read a number that includes a decimal point by invoking the nextDouble() method. 
 * Listing 2.2 rewrites Listing 2.1 to prompt the user to enter a radius. 
 * 
 * The Scanner class is in the java.util package. It is imported in line 3. 
 * Line 9 creates a Scanner object.
 * The statement in line 12 displays a message to prompt the user for input.
 * System.out.print ("Enter a number for radius: ");
 * 
 * The print method is identical to the println method 
 * except that println moves the cursor to the next line after displaying the string, 
 * but print does not advance the cursor to the next line when completed. 
 * 
 * The statement in line 13 reads an input from the keyboard.
 * double radius = input.nextDouble();
 * 
 * After the user enters a number and presses the Enter key, 
 * the number is read and assigned to radius.
 */
