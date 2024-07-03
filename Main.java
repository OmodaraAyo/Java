import java.util.Scanner;

public class Main {

	public static void main ( String [] args ){
	Scanner input = new Scanner ( System.in );

	
	System.out.println ( "It is 'even' if number entered is True" );
	System.out.println ( "It is 'odd' if number entered is false" );
	System.out.println ( "Enter a number or -1 to close app...\n" );
	System.out.print ("Enter a number:");
	int userInput = input.nextInt();

	while ( userInput != -1 ) {

	boolean result = Kata.even(userInput);
	System.out.printf ("%d is %b",userInput, result );

	System.out.print ("\nEnter a number:");
	userInput = input.nextInt();

	}

	if ( userInput == -1 ) {
		System.out.print ( "App closed" );
	}
	}
}
