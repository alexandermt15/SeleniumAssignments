package week1.day2;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1234567890;
	boolean isPunctured = false;
	String bikeName = "Yamaha";
	double runningKM = 576788234;

	public static void main(String[] args) {

		TwoWheeler obj = new TwoWheeler();
		System.out.println("Number of wheels is " + obj.noOfWheels);
		System.out.println("Number of mirrors is " + obj.noOfMirrors);
		System.out.println("Chassis number is " + obj.chassisNumber);
		System.out.println("Punctured " + obj.isPunctured);
		System.out.println("Bike Name " + obj.bikeName);
		System.out.println("Kilometer Run is " + obj.runningKM);

	}

}
