
		public class SumNumber {
			public static void main ( String [] args ) {
	
			int number = 0;
			int sum = 0;
			
		while ( number <= 9 ) {
		
				number++;
				sum = sum + number;
			System.out.printf ( " %d ", number );
		}
			System.out.printf ( "\nThe total number of natural numbers is \n%d ", sum );
	  }
	}