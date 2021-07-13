package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AverageAbove {
/**
평균은 넘겠지?
문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 * @throws IOException 
 * @throws NumberFormatException 
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// 테스트케이스 개수 C
		int C = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < C; i++) {
			// 줄마다 평균을 구하기
			// 평균 초과하는 학생 "반올림"하여 "소수 셋째"자리까지 출력
			st = new StringTokenizer(br.readLine());
			// 학생의 수 N
			double N = Double.parseDouble(st.nextToken());
			int sum = 0;		// 한줄 총합
			double avg = 0; 	// 한줄 평균
			double above = 0;		// 평균 이상 수 
			double[] person = new double[(int) N];
			for(int j = 0; j < N; j++) {
				person[j] = Integer.parseInt(st.nextToken());
				sum += person[j]; 
			}
			avg = sum / N;
			
			// 평균 초과인 사람의 수 (above 구하기)
			for(int k = 0; k < N; k++) {
				if(avg < person[k]) {
					above++;
				}
			}
			
			
			if(i == (C-1)) {
				sb.append(String.format("%.3f", above / N * 100)).append("%");
			}else {
				sb.append(String.format("%.3f", above / N * 100)).append("%").append(System.lineSeparator());
			}
		}
		System.out.println(sb);
		
		
	}
}
