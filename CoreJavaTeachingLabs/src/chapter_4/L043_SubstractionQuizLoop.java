package chapter_4;

import java.util.Scanner;

public class L043_SubstractionQuizLoop {
	public static void main(String[] args) {

		// Number of questions
		final int NUMBER_OF_QUESTIONS = 5;

		// Count the number of correct answers
		int correctCount = 0;

		// Count the number of questions
		int count = 0;

		// Get Start time
		long startTime = System.currentTimeMillis();

		// Output String is Initially empty
		String output = "";
		Scanner input = new Scanner(System.in);

		// Introduce the loop
		while (count < NUMBER_OF_QUESTIONS) {

			// 1. Generate two random single-digit integers
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			// 3. Prompt the student to answer "What is number1 - number2?"
			System.out.println("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();

			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are correct");
				correctCount++;
			} else 
				System.out.println(
						"Your answear is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
				// Increase the count
				count++;
			
			output += "\n" + number1 + " - " + number2 + " = " + answer + 
					((number1 - number2 == answer) ? " correct" : "wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is" + correctCount + "\nTest time is " + testTime/1000 + "seconds\n" + output);

	}

}

//NOTES

/* 
 * The program uses the control variable count to control the execution of the loop. 
 * count is initially 0 (line 15) and is increased by 1 in each iteration (line 50). 
 * A subtraction question is displayed and processed in each iteration. 
 * The program obtains the time before the test starts in line 18 and the time after the test ends in line 56, 
 * and computes the test time in line 57. 
 * The test time is in milliseconds and is converted to seconds in line 59.*/
