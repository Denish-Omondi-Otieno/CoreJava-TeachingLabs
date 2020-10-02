package chapter_4;

import java.util.Scanner;

public class L045_TestDoWhile {
	
	public static void main (String [] args) {
		int data;
		int sum =0;
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Keep reading data until the input is 0
		
		do {
			//Read the next data
			System.out.println("Enter an int value the program exists when the input is 0");
			data = input.nextInt();
			sum += data;
		} while (data !=0);
		System.out.println("The sum is: " + sum);
	} 

}
