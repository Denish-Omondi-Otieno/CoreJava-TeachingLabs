package chapter_3;

import java.util.Scanner;

public class L031_AdditionQuiz {
	
	public static void main (String [] args) {
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() * 7 % 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Receive the input
		System.out.println("What is: " + number1 + " + " +number2 + " ?");
		int answear = input.nextInt();
		
		//Display the results
		System.out.println(number1 + " + " + number2 + " = " + answear + " is " + 
		(number1 + number2 == answear));
	}

}

// NOTES 

/* Suppose you want to develop a program to let a first-grader practice addition. 
 * The program randomly generates two single-digit integers, number1 and number2, 
 * and displays to the student a question such as “What is ”, as shown in the sample run. 
 * After the student types the answer, the program displays a message to indicate whether it is true or false.
 * 
 * There are several ways to generate random numbers. 
 * For now, generate the first integer using System.currentTimeMillis() % 10 
 * and the second using System.currentTimeMillis() * 7 % 10
 * Listing 3.1 gives the program. 
 * Lines 8–9 generate two numbers, number1 and number2. 
 * Line 16 obtains an answer from the user. 
 * The answer is graded in line 20 using a Boolean expression number1 + number2 == answer.
*/