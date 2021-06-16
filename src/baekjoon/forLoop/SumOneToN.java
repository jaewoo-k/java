package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumOneToN {
/**
문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.
 * @throws IOException 
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
//		System.out.println(sum);
		
		//BufferedWriter 의 writer메소드는 int형을 출력할 수 없기 때문에 String으로 변환해줘야한다.
		bw.write(String.valueOf(sum));
		
		// BufferedWriter 는 출력하려면 flush나 close를 써줘야 함.
		bw.flush();
		bw.close();
		
		br.close();
	}

}
