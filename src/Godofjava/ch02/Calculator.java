package Godofjava.ch02;

public class Calculator {
	
	// 기본 더하기
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	// 3개 더하기
	public int addAll(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
	
	// 빼기
	public int substract(int a, int b) {
		int result = a - b;
		return result;
	}
	
	// 곱하기
	public int mulitply(int a, int b) {
		int result = a * b;
		return result;
	}
			
	// 나누기
	public int divide(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		System.out.println("Calculator class started");
		int a = 5;
		int b = 10;
		int c = 15;
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(a,b));
		System.out.println(cal.substract(a, b));
		System.out.println(cal.mulitply(a,b));
		System.out.println(cal.divide(a,b));
		
		
	}

}
