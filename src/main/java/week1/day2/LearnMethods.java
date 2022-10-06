package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {

		LearnMethods obj = new LearnMethods();
		obj.printCarName();

		int regnumber = obj.getRegNumber();
		System.out.println(regnumber);

		String color = obj.getRegColor();
		System.out.println(color);

		Boolean puncture = obj.isCarPunctured();
		System.out.println(puncture);

		int addThreeNumbers = obj.addThreeNumbers(32, 3, 4);
		System.out.println(addThreeNumbers);

		int subTwoNumbers = obj.subTwoNumbers(32, 3);
		System.out.println(subTwoNumbers);

		float multiple = obj.multiplyThreeNumbers(3, 3, 3);
		System.out.println(multiple);

		int divide = obj.divTwoNumbers(32, 3);
		System.out.println(divide);

	}

	public void printCarName() {
		System.out.println("Skoda");
	}

	public int getRegNumber() {

		int number = 7777;
		return number;

	}

	public String getRegColor() {

		String color = "Blue";
		return color;

	}

	public boolean isCarPunctured() {

		boolean puncture = false;
		return puncture;

	}

	public int addThreeNumbers(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	private int subTwoNumbers(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	float multiplyThreeNumbers(float float1, float float2, float float3) {
		float multiply = float1 * float2 * float3;
		return multiply;
	}

	public int divTwoNumbers(int div1, int div2) {
		int div = div1 / div2;
		return div;
	}

}
