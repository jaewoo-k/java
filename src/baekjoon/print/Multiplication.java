package baekjoon.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {
/*
 (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.

		int[] iarr1 = {4,7,2};
		int[] iarr2 = {3,8,5};
		int iNum1 = 472;
		int iNum2 = 385;

(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
  
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
		System.out.println("����ð� : secDiffTime : " + secDiffTime);
	}
}
