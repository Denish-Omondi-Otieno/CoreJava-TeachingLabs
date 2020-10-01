package chapter_3;

import java.util.Scanner;

public class L034_SubtractionQuiz {
	public static void main(String[] args) {

		// 1. Generate two random single-digit integers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// 2. If number1 < number2, swap number1 with number2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// 3. Prompt the student to answer " What is number1 - n"
		System.out.println("What is " + number1 + " - " + number2 + " ? ");

		// 4. Create a Scanner Object
		Scanner input = new Scanner(System.in);
		int answear = input.nextInt();

		// 5. Grade the answear and display the result
		if (number1 - number2 == answear) {
			System.out.println("You are correct");
		} else {
			System.out.println("Your answear is wrong\n" + number1 + " - " + number2 + " is " + (number1 - number2));
		}

	}

}

// Notes

/* The program may work as follows:
 * Generate two single-digit integers into number1 and number2.
 * If number1 < number2, swap number1 with number2.
 * Prompt the student to answer “What is number1 – number2?”
 * Check the student’s answer and display whether the answer is correct.
 * 
The complete program is shown in Listing 3.4.

/* The previous programs generate random numbers using System.currentTimeMillis().
 * A better approach is to use the random() method in the Math class. 
 * Invoking this method returns a random double value d such that So, (int)(Math.random() *10)
 * returns a random single-digit integer casting occurs.
 * 
 * To swap two variables number1 and number2, a temporary variable temp (line
 * 14) is used to first hold the value in number1. The value in number2 is
 * assigned to number1 (line 15), and the value in temp is assigned to number2
 * (line 16).
 * 
 * }
 */