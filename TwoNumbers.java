import java.util.Scanner;

	public class TwoNumbers {
	
		public void run (){
		Scanner it = new Scanner ( System.in );
		
		System.out.print ( " Enter first number: " );
		int firstNumber = it.nextInt();
		
		System.out.print ( " Enter second number: " );
		int secondNumber = it.nextInt();
		
		
		int number = firstNumber;
		int number1 = secondNumber;
		
		int number2 = ( firstNumber )^ secondNumber;
		int number3 = ( secondNumber ) ^ firstNumber;
		
		System.out.printf ( " The value of the firstNumber raised to the power of secondNumber is %d\n ", number2 );
		System.out.printf ( " The value of the secondNumber raised to the power of firstNumber is %d\n ", number3 );
		
		}
	}