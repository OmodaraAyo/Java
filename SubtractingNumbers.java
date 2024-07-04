import java.util.Scanner;

public class SubtractingNumbers {

	public static void main ( String [] args ) {
	Scanner input = new Scanner ( System.in );

	System.out.print ("Enter a number: " );
	int firstNumber = input.nextInt();

	System.out.print ("Enter a number: " );
	int secondNumber = input.nextInt();

	int subtraction = Kata.subtract (firstNumber, secondNumber );
	System.out.printf ("%d", subtraction );

	}
}