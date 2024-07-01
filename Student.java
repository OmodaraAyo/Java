// Student.java
// A program that lets student enter their score and display student above 60 as " pass ", while student below 60 as " you don't pass ".

	// program uses class Scanner
	import java.util.Scanner;

		// class method name
		public class Student {

			// main method to execute the java application
			public static void main ( String [ ] args ) {

			// create a Scanner to obtain input from the command window
			Scanner input = new Scanner ( System.in );

			// read the first value from the user
			System.out.printf ( " Enter first integer: " );
			int value1 = input.nextInt ();

			// the average score that determines student grades
			int value2 = 60;

			// checking the user input score to determine if user " pass "
			if( value1 >= 60 ) {

			// to display if the user pass
			System.out.println ( " You pass the exam " );
			}

			// to display if user failed
			else if( value1 <= 59 ) {

			// to display if the user don't pass
			System.out.printf ( " You don't pass the exam " );
			}
		}

	}




