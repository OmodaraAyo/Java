import java.util.Scanner;
public class BackToSenderLogisticsServices {

	public static void main (String... args ) {
	Scanner input = new Scanner (System.in);

	System.out.print ("Welcome to Back To Sender Logistics Services app.");
	System.out.print("\nPress 1 to continue or any number to close app: ");
	int number = input.nextInt();

if (number ==  1 ) {
		
		System.out.print ("\nEnter number of successful delivery or -1 to close app: ");
		int userInput = input.nextInt();

		while ( userInput != -1 ) {
			
			int salary = Salary.calculator(userInput);
			System.out.printf ("#%d allowance only.", salary);

		System.out.print ("\n\nEnter number of successful delivery or -1 to close app: " );	
		userInput = input.nextInt();
		}
		if ( userInput == -1 ) {

			System.out.print ("App closed");
		   }

	}

else System.out.print ("App closed");


}
}