package week1.day2;

public class MyCar {

	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.printCarName();

		int regnumber = obj.getRegNumber();
		System.out.println(regnumber);

		String color = obj.getRegColor();
		System.out.println(color);

		Boolean puncture = obj.isCarPunctured();
		System.out.println(puncture);

		int addThreeNumbers = obj.addThreeNumbers(3, 3, 4);
		System.out.println(addThreeNumbers);

	//	int subTwoNumbers = obj.subTwoNumbers(32, 3);
	//	System.out.println(subTwoNumbers);

		float multiple = obj.multiplyThreeNumbers(3, 3, 3);
		System.out.println(multiple);

		int divide = obj.divTwoNumbers(32, 3);
		System.out.println(divide);
	}
}
