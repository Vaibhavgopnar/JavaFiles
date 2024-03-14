package programs;

abstract class Plane {
	void takeOff() {
		System.out.println("Plane took off");
	}

	abstract void fly();

	abstract void land();
}

class Airport {
	void permit(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}

class CargoPlane extends Plane {

	void fly() {
		System.out.println("CargoPlane fly at low heights");
	}

	void land() {
		CargoPlane c = new CargoPlane();
		c.carryGoods();
	}

	void carryGoods() {
		System.out.println("CargoPlane Carry goods");
	}
}

class PassengerPlane extends Plane {

	void fly() {
		System.out.println("PassengerPlane fly at medium heights");
	}

	void land() {
		PassengerPlane c = new PassengerPlane();
		c.carryPassenger();
	}

	void carryPassenger() {
		System.out.println("PassengerPlane Carry Passengers");
	}
}

class FighterPlane extends Plane {
	void fly() {
		System.out.println("FighterPlane fly at medium heights");
	}

	void land() {
		FighterPlane c = new FighterPlane();
		c.carryWeapons();
	}

	void carryWeapons() {
		System.out.println("FighterPlane Carry Weapons");
	}
}

public class P25_PillersOfOOps {

	public static void main(String[] args) {

		CargoPlane c = new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
		Airport a = new Airport();
		a.permit(c);
		System.out.println("--------------------------");
		a.permit(p);
		System.out.println("--------------------------");
		a.permit(f);
	}
}
