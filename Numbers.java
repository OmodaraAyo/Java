import java.util.Scanner;

	public class Numbers {

		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );

	System.out.print ("Enter your name: " );
	String name = input.nextLine();

	System.out.printf ("Welcome %s", name );

	System.out.print ("\nPlease enter 1 to continue: " );
	int number = input.nextInt();

	if  ( number == 1 ) {

	System.out.print ("\n1. One 		2. Two			3.Three" );
	System.out.print ("\n4. Four		5. Five			6. Six"  );
	System.out.print ("\n7. Seven	8.Eight			9. Nine" );
	System.out.print ("\n10.Ten" );

	System.out.print ("\nEnter a number between 1-10 or -1 to end app" );
	System.out.print ("\n\nEnter a number:" );
	int number2 = input.nextInt();

	while ( number2 != -1 ) {


		switch ( number2 ) {

		case 1: System.out.print ("One" );
		break;
		
		case 2: System.out.print ("Two");
		break;

		case 3: System.out.print ("Three");
		break;

		case 4: System.out.print ("Four");
		break;

		case 5: System.out.print ("Five");
		break;

		case 6: System.out.print ("Six");
		break;
	
		case 7: System.out.print ("Seven");
		break;

		case 8: System.out.print ("Eight");
		break;

		case 9: System.out.print ("Nine");
		break;
		
		case 10: System.out.print ("Ten");
		break;

		default: System.out.print ("Invalid");
		break;
	
	   }

	System.out.print ("\nPlease enter a number:" );
	number2 = input.nextInt();
      }
	if ( number2 == -1 ) {
		System.out.print ("App closed");
	}
}

	if ( number != 1 ) {

		System.out.print ( "App closed" );
	   }

	}
}
	