public class Patterns {

		public static void main ( String [] args ) {
		
		int patternA = 1;
		int patternB = 1;
		int patternC = 1;
		int patternD = 1;
		int number = 0;
		int number1 = 1;
		int number2 = 1;
		int number3 = 1;
		int number4 = 1;
		int number5 = 1;
		int number6 = 1;
		
		System.out.println (" \n pattern A " ); 
			while ( number <= 5 ) {
				 number++;
			
				 if ( number <= 1) {
					 
					number1 = number; 
					number2 = number + number;
					number3 = number + number + number;
					number4 = number + number + number + number;
					number5 = number + number + number + number + number;
					number6 = number + number + number + number + number + number;
				 }
			} 
					
					System.out.printf (" \n%d ", number1 );
					System.out.printf ( " \n%d %d ", number1, number2 );
					System.out.printf ( " \n%d %d %d ", number1, number2, number3 );
					System.out.printf ( " \n%d %d %d %d ", number1, number2, number3, number4 );
					System.out.printf ( " \n%d %d %d %d %d ", number1, number2, number3, number4, number5 );
					System.out.printf ( " \n%d %d %d %d %d %d\n ", number1, number2, number3, number4, number5, number6 );
					System.out.println ( " \n pattern B " );
					System.out.printf ( " \n%d %d %d %d %d %d ", number1, number2, number3, number4, number5, number6 );
					System.out.printf ( " \n%d %d %d %d %d ", number1, number2, number3, number4, number5 );
					System.out.printf ( " \n%d %d %d %d ", number1, number2, number3, number4 );
					System.out.printf ( " \n%d %d %d ", number1, number2, number3 );
					System.out.printf ( " \n%d %d ", number1, number2 );
					System.out.printf (" \n%d ", number1 );
					System.out.println ( " \n pattern C " );
					System.out.println ( " 	  1 " );
					System.out.println( "	2 1 ");
					System.out.println ( "      3 2 1 " );
					System.out.println ( "    4 3 2 1 " );
					System.out.println ( "  5 4 3 2 1 " );
					System.out.println ( "6 5 4 3 2 1 " );
					System.out.println ( " \n pattern D " );
					System.out.println ( "1 2 3 4 5 6 " );
					System.out.println ( "  1 2 3 4 5 " );
					System.out.println ( "    1 2 3 4 " );
					System.out.println ( "      1 2 3 " );
					System.out.println ( "        1 2 " );
					System.out.println ( "          1 " );
					
					
					
					
					
					
		}
}
			
		