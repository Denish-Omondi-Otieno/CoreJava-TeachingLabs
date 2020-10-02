package chapter_3;

import java.util.Scanner;

public class L038_LeapYear {
	public static void main (String [] args) {
		
		//Create a Scanner Object
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		//Check if the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	
	// Display the results
		System.out.println(year + " is a leap year? " + isLeapYear);
	}
	

}

//NOTES

/* A year is a leap year if it is divisible by 4 but not by 100 
* or if it is divisible by 400. 
* So you can use the following Boolean expressions 
* to check whether a year is a leap year:
*/