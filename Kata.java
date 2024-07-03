public class Kata {

	public static boolean even ( int userInput ) {


		 if ( userInput % 2 == 0 ) {
		  
		return true;	
		} 
		else {
			return false;
		
		}
}

	public static boolean prime ( int userInput ) {

		int primeNumber = 0;
		for ( int counter = 1; counter <= userInput / 2; counter+=1 ) {

			if ( userInput % counter == 0 ) {

				primeNumber = primeNumber + counter;
			}
		}
				
		if ( primeNumber == 1 ) {
			return true;
		}
		else return false;
	}
	
}