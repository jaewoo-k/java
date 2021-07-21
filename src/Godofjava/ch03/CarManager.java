package Godofjava.ch03;

public class CarManager {
	public static void main(String[] args) {
		Car dogCar = new Car();
		Car cowCar = new Car();
		
		dogCar.setSpeed(100);
		System.out.println("현재 속도 : " + dogCar.getSpeed());
		
		System.out.println(dogCar.getCurrentSpeed());
	}
}
