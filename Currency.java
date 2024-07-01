// Currency.java
// to help user convert from U.S dollars to Chinese RMB.

	// program uses class Scanner
	import java.util.Scanner;

		// class method name
		public class Currency {

		// main methods to begin execution of the program
		public static void main ( String [] args ) {

		// create a Scanner to obtain input from the command windows
		Scanner input = new Scanner ( System.in );

		// read the first number from the user
		System.out.printf ( " Enter first integer: " );
		double value1 = input.nextDouble();

		// read the second number from the user, either 0 or 1
		System.out.printf ( " Enter second integer: " );
		byte value2 = input.nextByte();

		// read the third number from the user
		System.out.printf ( " Enter third integer: " );
		double value3 = input.nextDouble(); 


		if ( value2 == 0 ) {

		System.out.println ( " convert dollars to  RMB " );

		// convert dollars to RMB
		double value4 =  ( value3 * value1 );

		// displays the result of value4
		System.out.printf ( " Multiplication %.2f ", value4 );
		}


		else if( value2 == 1 ) {
		System.out.println ( " convert RMB to dollars " );

		// to convert RMB to dollars
		double value5 = ( value3 / value1 );

		// displays the result of value5
		System.out.printf ( " Division %.2f " , value5 );
		}
	}

}
		

		

	
	
	