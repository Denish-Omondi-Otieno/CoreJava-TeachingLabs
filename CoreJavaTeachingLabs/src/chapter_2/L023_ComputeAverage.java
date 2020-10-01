package chapter_2;

import java.util.Scanner; // Scanner is in the java.util package

public class L023_ComputeAverage {
	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three numbers
		System.out.println("Enter three number: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		//Compute average
		double average = (number1 + number2 + number3) / 3;

		//Display result
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
	}

}
 
// NOTES

/* The code for importing the Scanner class (line 3) and creating a Scanner object (line 8) 
 * are the same as in the preceding example as well as in all new programs you will write.
 * 
 * Line 10 prompts the user to enter three numbers. 
 * The numbers are read in lines 11–13. 
 * You may enter three numbers separated by spaces, 
 * then press the Enter key, or enter each number followed by a press of the Enter key.
 */
 
// IDENTIFIERS

/* As you see in Listing 2.3, ComputeAverage, main, input, number1, number2, number3,
 * and so on are the names of things that appear in the program. 
 * Such names are called identifiers. 
 * All identifiers must obey the following rules:
 * An identifier is a sequence of characters that consists of letters, digits, underscores
 * (_), and dollar signs ($).
 * An identifier must start with a letter, an underscore (_), or a dollar sign ($).It cannot start with a digit.
 * An identifier cannot be a reserved word. (See Appendix A, “Java Keywords,” for a list of reserved words.)
 * An identifier cannot be true, false, or null. 
 * An identifier can be of any length.
 * 
 * For example, $2, ComputeArea, area, radius, and showMessageDialog are legal identifiers, 
 * whereas 2A and d+4 are not because they do not follow the rules. 
 * 
 * The Java compiler detects illegal identifiers and reports syntax errors.
 * 
 * Since Java is case sensitive, area, Area, and AREA are all different identifiers.
 * Identifiers are for naming variables, constants, methods, classes, and packages. 
 * Descriptive identifiers make programs easy to read. 
 * 
 * Do not name identifiers with the $ character. 
 * By convention, the $ character should be used only 
 * in mechanically generated source code.
 * 
 
 // VARIABLES
 
/* variables are used to store values to be used later in a program. 
 * They are called variables because their values can be changed. 
 * In the program in Listing 2.2, 
 * radius and area are variables of double-precision, floatingpoint type. 
 * You can assign any numerical value to radius and area, 
 * and the values of radius and area can be reassigned.
 * 
 * Variables are for representing data of a certain type. 
 * To use a variable, you declare it by telling the compiler its name as well as what type of data it can store. 
 * The variable declaration tells the compiler to allocate appropriate memory space for the variable based on its data type. 
 * The syntax for declaring a variable is
 *  
 * datatype variableName;
 * 
 * Here are some examples of variable declarations:
 * 
 * int count; // Declare count to be an integer variable;
 * double radius; // Declare radius to be a double variable;
 * double interestRate; // Declare interestRate to be a double variable;
 * 
 * The examples use the data types int, double, and char. 
 * Later you will be introduced to additional data types, such as byte, short, long, float, char, and boolean.
 * 
 * If variables are of the same type, they can be declared together, as follows:
 * 
 * datatype variable1, variable2, ..., variablen;
 * 
 * The variables are separated by commas. 
 * For example, 
 * 
 * int i, j, k; // Declare i, j, and k as int variables
 * 
 * Note 
 * By convention, variable names are in lowercase. 
 * If a name consists of several words, concatenate all of them 
 * and capitalize the first letter of each word except the first. 
 * 
 * Examples of variables are 
 * 
 * radius and interestRate.
 * 
 * Variables often have initial values. 
 * You can declare a variable and initialize it in one step.
 * 
 * Consider, for instance, the following code:
 * 
 * int count = 1;
 * 
 * This is equivalent to the next two statements:
 * 
 * int count;
 * x = 1;
 * 
 * You can also use a shorthand form to declare and initialize variables of the same type together.
 * For example,
 * 
 * int i = 1, j = 2;
 * 
 * Tip
 * A variable must be declared before it can be assigned a value. 
 * A variable declared in a method must be assigned a value before it can be used. 
 * Whenever possible, declare a variable and assign its initial value in one step. 
 * This will make the program easy to read and avoid programming errors.
 */

 // Assignment Operator and Assignment Expression 
 
 /* After a variable is declared, you can assign a value to it by using an assignment statement. 
  * In Java, the equal sign (=) is used as the assignment operator. 
  * The syntax for assignment statements is as follows:
  * 
  * variable = expression;
  * 
  * An expression represents a computation involving values, variables, and operators that,
  * taking them together, evaluates to a value. 
  * 
  * For example, consider the following code:
  * 
  * int x = 1; // Assign 1 to variable x
  * double radius = 1.0; // Assign 1.0 to variable radius 
  * x = 5 * (3 / 2) + 3 * 2; // Assign the value of the expression to x
  * x = y + 1; // Assign the addition of y and 1 to x
  * area = radius * radius * 3.14159; // Compute area
  * 
  * A variable can also be used in an expression. 
  * For example, 
  * 
  * x = x + 1;
  * 
  * In this assignment statement, 
  * the result of x + 1 is assigned to x. 
  * If x is 1 before the statement is executed, then it becomes 2 after the statement is executed.
  * To assign a value to a variable, the variable name must be on the left of the assignment operator. 
  * Thus, 1 = x would be wrong.
  * 
  * Note
  * 
  * In mathematics, x = 2 * x + 1 denotes an equation. 
  * However, in Java, x = 2 * x + 1 is
  * an assignment statement that evaluates the expression 2 * x + 1 and assigns the result to x.
  * 
  * In Java, an assignment statement is essentially an expression 
  * that evaluates to the value to be assigned to the variable on the left-hand side of the assignment operator. 
  * For this reason, an assignment statement is also known as an assignment expression. 
  * 
  * For example, the following statement is correct: 
  * 
  * System.out.println(x = 1);
  * 
  * which is equivalent to 
  * 
  * x = 1;
  * System.out.println(x);
  * 
  * The following statement is also correct:
  * 
  * i = j = k = 1;
  * 
  * which is equivalent to 
  * k = 1;
  * j = k;
  * i = j;
  * 
  * Note
  * In an assignment statement, 
  * the data type of the variable on the left 
  * must be compatible with the data type of the value on the right. 
  * 
  * For example, int x = 1.0 would be illegal, 
  * because the data type of x is int. 
  * You cannot assign a double value (1.0) to an int variable without 
  * using type casting. 
  */
