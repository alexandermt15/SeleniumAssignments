package week3.day2;

public class MyBankAccount {

	public static void main(String[] args) {
		Hdfc myhdfc = new Hdfc();
		myhdfc.minimumBalance(1000);
		myhdfc.provideCreditCard();
		myhdfc.provideCreditCard();
		
		//Scope limitation of Object
		Rbi myrbi= new Hdfc();
		myrbi.provideDebitCard();
		
		// Method not available as its additional menthod in implemented class
		//myrbi.provideCreditCard();

	}

}
