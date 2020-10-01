package chapter_2;

public class L021_ComputeArea {
	
	public static void main (String [] args) {
		double radius; // Declare radius
		double area; // Declare area
		
		// Assign a radius
		radius = 20; // New value is radius
		
		// Compute area
		area = radius * radius * 3.14159;
		
		// Display results
		System.out.println("The area for the circle of radius " + 
		radius + " is " +	area);
		
	}

}

//NOTES

/* let’s look at a simple problem for computing the area of a circle. 
 * How do we write a program for solving this problem?
 * 
 * Writing a program involves designing algorithms and translating algorithms into code. 
 * An algorithm describes how a problem is solved in terms of the actions to be executed and the order of their execution. 
 * Algorithms can help the programmer plan a program before writing it in a programming language.
 * 
 * The algorithm for this program can be described as follows:
 * 
 *     1. Read in the radius.
 *     2. Compute the area using the following formula:
 *         area = radius * radius * p
 *     3. Display the area.
 *     
 *     When you code, you translate an algorithm into a program
 *     The program needs to read the radius entered by the user from the keyboard. 
 *     
 *     This raises two important issues:     
 *     a) Reading the radius.
 *     b) Storing the radius in the program.
 *     
 *     Let’s address the second issue first. 
 *     In order to store the radius, the program needs to declare a symbol called a variable. 
 *     A variable designates a location in memory for storing data and computational results in the program. 
 *     A variable has a name that can be used to access the memory location.
 *     
 *     Rather than using x and y as variable names, choose descriptive names: 
 *     in this case, radius for radius, and area for area. 
 *     To let the compiler know what radius and area are, specify their data types. 
 *     
 *     Java provides simple data types for representing: 
 *     integers, floating point numbers (i.e., numbers with a decimal point), characters, and Boolean types. 
 *     These types are known as primitive data types or fundamental types.
 *     Declare radius and area as double-precision floating-point numbers.
 *     
 *     The reserved word double indicates that radius and area are double-precision floating-point values stored in the computer.
 *     The first step is to read in radius. 
 *     Reading a number from the keyboard is not a simple matter. 
 *     For the time being, let us assign a fixed value to radius in the program.
 *     
 *     Variables such as radius and area correspond to memory locations. 
 *     Every variable has a name, a type, a size, and a value. 
 *     Line 6 declares that radius can store a double value. 
 *     The value is not defined until you assign a value. 
 *     Line 10 assigns 20 into radius. 
 *     Similarly, line 7 declares variable area, and line 13 assigns a value into area.
 *     
 *     The plus sign (+) has two meanings: 
 *     one for addition and the other for concatenating strings. 
 *     The plus sign (+) in lines 16–17 is called a string concatenation operator. 
 *     It combines two strings if two operands are strings. 
 *     If one of the operands is a nonstring (e.g., a number).
 *     The nonstring value is converted into a string and concatenated with the other string. 
 *     So the plus signs (+) in lines 16–17 concatenate strings into a longer string, 
 *     which is then displayed in the output.
 *     
 *     A string constant cannot cross lines in the source code. 
 *     Thus the following statement would result in a compile error:
 *     
 *     System.out.println("Introduction to Java Programming,
 *     by Y. Daniel Liang");
 *     
 *     To fix the error, break the string into separate substrings, 
 *     and use the concatenation operator (+) to combine them:
 *     
 *     System.out.println("Introduction to Java Programming, " +
		"by Y. Daniel Liang");
*/