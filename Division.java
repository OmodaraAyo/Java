import java.util.Scanner;

public class Division {

	public static void main ( String [] args ) {
	Scanner input = new Scanner ( System.in );

	System.out.print ("Enter a number: ");
	float firstNumber = input.nextFloat();

	System.out.print ("Enter a number: ");
	float secondNumber = input.nextFloat();

	float result = Kata.divide ( firstNumber, secondNumber );
	System.out.printf ("%.2f ", result );

	}
}