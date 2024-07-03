import java.util.Scanner;
public class Prime{

	public static void main ( String [] args ){
	Scanner input = new Scanner ( System.in );

	
	System.out.println ( "It is a 'Prime Number' if number entered is True" );
	System.out.println ( "It is not a 'Prime Number' if number entered is false" );
	System.out.println ( "Enter a number or -1 to close app...\n" );
	System.out.print ("Enter a number:");
	int userInput = input.nextInt();

	while ( userInput != -1 ) {

	boolean result = Kata.prime(userInput);
	
	System.out.print (result ? "true" : "false" );

	
	System.out.print ("\nEnter a number:");
	userInput = input.nextInt();

	}

	if ( userInput == -1 ) {
		System.out.print ( "App closed" );
	}
	}
}