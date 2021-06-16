package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AdditionVer3 {
/**
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * @throws IOException 
 * @throws NumberFormatException 
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; 
		int T = Integer.parseInt(br.readLine());
		
		// StringTokenizer 이용 - ver1	(80ms)
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
//			while(st.hasMoreTokens()) {
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
//			}
		}
		System.out.println(sb);
		
		
		
		// T번 생성하는 반복문 ( split 메소드 이용)- ver2	(84ms)
		/*
		for(int i = 0; i < T; i++) {
			String[] readLine = br.readLine().split(" ");
			int result = Integer.parseInt(readLine[0]) + Integer.parseInt(readLine[1]);
			System.out.println(result);
		}
		*/
		br.close();
//		bw.close();
		
		
		
	}
}
