package baekjoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountNumber {
/**
문제
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

입력
첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

출력
첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// A * B * C 의 결과값
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
			// char -> int형으로 변환
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
