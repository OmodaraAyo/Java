import java.util.Scanner;
public class  FactorOfInteger{

	public static void main ( String [] args ){
	Scanner input = new Scanner ( System.in );

	System.out.print ("Enter a number:");
	int userInput = input.nextInt();

	int result = Kata.factors (userInput);

	if ( result == 1 ) System.out.printf ("'%d' total number of factors is just %d",userInput, result );

	else System.out.printf ("'%d' total numbers of factors are %d",userInput, result );


	}
}