package baekjoon.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {
/*
 (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

		int[] iarr1 = {4,7,2};
		int[] iarr2 = {3,8,5};
		int iNum1 = 472;
		int iNum2 = 385;

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
  
 */
	public static void main(String[] args) throws IOException {
		long beforeTime = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		sb.append(num1 * (num2 % 10));
		sb.append("\n");
		
		sb.append(num1 * (num2 % 100 / 10));
		sb.append('\n');
		
		sb.append(num1 * (num2 / 100));
		sb.append("\n");
		
		sb.append(num1 * num2);

		System.out.println(sb);
		
	
		// 472*5 
		// 472*8
		// 472*3
		
		
		
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime-beforeTime);
		System.out.println("beforeTime : " + beforeTime);
		System.out.println("afterTime : " + afterTime);
		System.out.println("실행시간 : secDiffTime : " + secDiffTime);
	}
}
