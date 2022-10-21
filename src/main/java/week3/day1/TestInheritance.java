package week3.day1;

public class TestInheritance {
	public static void main(String[] args) {
		Car newcar = new Car();

		newcar.applyBrake();
		newcar.soundHorn();
		newcar.openSunRoof();
		newcar.turnOnAc();

		Bmw testbmw = new Bmw();

		testbmw.autoPark();
		testbmw.applyBrake();

		Audi testaudi = new Audi();

		testaudi.hybridFuel();
		testaudi.openSunRoof();

		Auto newauto = new Auto();
		newauto.applyBrake();
		newauto.handStarter();

		Bajaj testbajaj = new Bajaj();

		testbajaj.electronicMeter();
		testbajaj.handStarter();

	}
}
