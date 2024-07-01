import java.util.Scanner;

	public class Ebanking {

		public static void main ( String [] args ) {
		Scanner it = new Scanner ( System.in );
		

	
	System.out.print ( " Welcome to ( Ebank ) USSD Banking, N6.98 network charge will apply to your account for banking services on this channel.\n " );
	
	System.out.print ( "Press 1 to continue and 0 to end:" );
	int value = it.nextInt();
	
	if ( value == 1 ) {
	
			System.out.print ( "\n1: Transfer\n2: Buy airtime\n3: Buy data\n4: Share data\n99: go back " );
			System.out.print ("\nPress any number to get started: " ); 
		switch ( it.nextInt() ) {

			case 1: System.out.print ( "Transfer" );
				System.out.print ( "\n1: Transfer  to E banking account\n2: Transfer to Zenith\n3: Transfer to Kuda\n4: Transfer to Others\n99: go back " );
				System.out.print ( "\nEnter a number: ");

				switch ( it.nextInt() ) {
					
						case 1: System.out.print ( "Transfer to E banking account" );
							break;
						case 2: System.out.print ( "Transfer to Zenith" );
							break;
						case 3: System.out.print ( "Transfer to Kuda" );
							break;
						case 4: System.out.print ( "Transfer to Others");
							break;
						case 99: System.out.print ( " go back" );
							break;
						default: System.out.print ( "Invalid" );
							break;
					}
							
				break;
			case 2: System.out.print ( "Buy airtime" );
				break;
			case 3: System.out.print ( "Buy data" );
				break;
			case 4: System.out.print ( "Share data" );
				break;
			case 99: System.out.print ( "Go back" );
				break;
			default: System.out.print ( "Invalid" );
	  	}
	}

	else if ( value == 0 ) {

		System.out.println ( " App closed " );
	}

	else {

		System.out.print ( " Invalid " );
	}

    }
} 