package chapter_2;

public class L026_ShowCurrentTime {

	public static void main(String[] args) {
		
		// Obtain the total miliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1 1970
		long totalSeconds = totalMilliseconds/1000;
		
		//Compute the current second in the minute in the hour
		long currentSecond = (int)(totalSeconds % 60);
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Obtain the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;
		
		System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT");

	}

}

//NOTES

/* The problem is to develop a program that displays the current time in GMT 
 * (Greenwich Mean Time) in the format hour:minute:second, such as 13:19:8.
 * The currentTimeMillis method in the System class 
 * returns the current time in milliseconds elapsed 
 * since the time 00:00:00 on January 1, 1970 GMT,
 * 
 * This time is known as the Unix epoch, 
 * because 1970 was the year when the Unix operating
 * system was formally introduced.
 * 
 * The System.currentTimeMillis() returns the number of milliseconds
 * since the Unix epoch.
 * 
 * You can use this method to obtain the current time, 
 * and then compute the current second, minute, and hour as follows.
 * 
 * 1. Obtain the total milliseconds since midnight, Jan 1, 1970, 
 * in totalMilliseconds by invoking System.currentTimeMillis() (e.g., 1203183086328 milliseconds).
 * 
 * 2. Obtain the total seconds totalSeconds by dividing totalMilliseconds by 1000
 * (e.g., 1203183086328 milliseconds / 1000 = 1203183086 seconds).
 * 
 * 3. Compute the current second from totalSeconds % 60 (e.g., 1203183086 seconds
 * % 60 = 26, which is the current second).
 * 
 * 4. Obtain the total minutes totalMinutes by dividing totalSeconds by 60 (e.g.,
 * 1203183086 seconds / 60 = 20053051 minutes).
 * 
 * 5. Compute the current minute from totalMinutes % 60 
 * (e.g., 20053051 minutes % 60 = 31, which is the current minute).
 * 
 * 6. Obtain the total hours totalHours by dividing totalMinutes by 60 
 * (e.g.,20053051 minutes / 60 = 334217 hours).
 * 
 * 7. Compute the current hour from totalHours % 24 
 * (e.g., 334217 hours % 24 = 17, which is the current hour). 
 * 
 * When System.currentTimeMillis() (line 8) is invoked, 
 * it returns the difference, measured in milliseconds, 
 * between the current GMT and midnight, January 1, 1970 GMT. 
 * This method returns the milliseconds as a long value. 
 * So, all the variables are declared as the long type in this program.
 * */