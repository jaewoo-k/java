package baekjoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountNumber {
/**
����
�� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.

�Է�
ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�.

���
ù° �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// A * B * C �� �����
		int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//		int result = 17037300;
		
		String A = Integer.toString(result);
		char[] temp = A.toCharArray();
		
		int t0 = 0; 
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
		int t5 = 0;
		int t6 = 0;
		int t7 = 0;
		int t8 = 0;
		int t9 = 0;
		
		for(char count : temp) {
			// char -> int������ ��ȯ
			switch(count - 48) {
			case 0 : t0++; break;
			case 1 : t1++; break;
			case 2 : t2++; break;
			case 3 : t3++; break;
			case 4 : t4++; break;
			case 5 : t5++; break;
			case 6 : t6++; break;
			case 7 : t7++; break;
			case 8 : t8++; break;
			case 9 : t9++; break;
			}
		}
		
		sb.append(t0).append("\n")
		.append(t1).append("\n")
		.append(t2).append("\n")
		.append(t3).append("\n")
		.append(t4).append("\n")
		.append(t5).append("\n")
		.append(t6).append("\n")
		.append(t7).append("\n")
		.append(t8).append("\n")
		.append(t9);
		System.out.println(sb);
	}

}
