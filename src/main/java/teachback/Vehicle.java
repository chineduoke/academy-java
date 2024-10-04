package teachback;

abstract class Vehicle {

	abstract void start();


	public static void main(String[] args) {

		Car car = new Car();
		car.start();
	    

		Bike bike = new Bike();
		bike.start();

	}
}

class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Push to Start");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Kick start the bike");
	}
}
