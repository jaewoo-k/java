package Godofjava.ch03;

public class Car {
	int speed;
	int distance;
	String color;
	
	public Car() {}
	
	public void speedUp() {
		this.speed += 5;
	}
	
	public void breakDown() {
		this.speed -= 10;
	}

	//책의 내용을 위해 중복된 메소드 사용
	public int getCurrentSpeed() {
		return speed;
	}
	
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
