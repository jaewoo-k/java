package baekjoon.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourArithmeticOperation {
/*
 * 
����
�� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
�� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)

 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		String[] arr = temp.split(" ");
		
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		
		
	}

}
