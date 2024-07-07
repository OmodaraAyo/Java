public class Salary {


	public static int calculator ( int userInput ) {

	int basePay = 5000;
	int salary;

		if (userInput > 100){

			int amountPerParcel = 0;
			salary = userInput * 0;
			return salary;
		}

		if (userInput >= 70 && userInput <= 100) {

			int amountPerParcel = 500;
			salary = userInput * amountPerParcel + basePay;
			return salary;
		}

		if (userInput >= 60) {

			int amountPerParcel = 250;
			salary = userInput * amountPerParcel + basePay;
			return salary;
		}

		if (userInput >= 50) {
		
			int amountPerParcel = 200;
			salary = userInput * amountPerParcel + basePay;
			return salary;
		}

		if (userInput < 50 && userInput >=1 ) {
		
			int amountPerParcel = 160;
			salary = userInput * amountPerParcel + basePay;
			return salary;
		}
	 	
		if (userInput <= 0) {
		
			int amountPerParcel = 0;
			salary = userInput * 0;
			return salary;
		}
		
		return 0;
      }
}