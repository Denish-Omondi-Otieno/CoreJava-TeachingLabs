package chapter_4;

import java.util.Scanner;

public class L044_SentinelValue {

	public static void main(String[] args) {

		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Read an initial input
		System.out.println("Enter an int value (the program exits if the input is 0):");
		int data = input.nextInt();

		// Keep reading data until the input is 0
		int sum = 0;
		while (data != 0) {
			sum += data;

			// Read the next data
			System.out.println("Enter an int value (the program exits if the input is 0):)");
			data = input.nextInt();

		}
		System.out.println("The sum is " + sum);

	}

}

/*  writes a program that reads and calculates the sum of an unspecified number of
integers. The input
0 signifies the end of the input. Do you need to declare a new variable for
each input value? No. Just use one variable named data (line 12) to store the input value and
use a variable named sum (line 15) to store the total. Whenever a value is read, assign it to
data and, if it is not zero, add it to sum (line 17).

If data is not 0, it is added to sum (line 17) and the next item of input data is read (lines
20–22). If data is 0, the loop body is no longer executed and the while loop terminates. The
input value 0 is the sentinel value for this loop. Note that if the first input read is 0, the loop
body never executes, and the resulting sum is 0.
 
 */