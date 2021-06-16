package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintN {
/**
문제
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		long a = System.currentTimeMillis();
		for(int i = 1; i <= N; i++) {
			// StringBuilder를 통해 출력.
			
			sb.append(i);
			sb.append("\n");
//			System.out.println(i);
		}
		System.out.println(sb);
		
		long b = System.currentTimeMillis();
//		System.out.println((b-a));
		
	}
}
