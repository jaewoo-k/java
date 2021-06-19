package baekjoon.whildLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdditionVer4 {
/**
A+B - 4
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
 * @throws IOException 

 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String temp;
		// readLine()의 반환 값은 String이므로 읽어올 것이 없으면 null
		while( (temp = br.readLine()) != null ) {
			st = new StringTokenizer(br.readLine(), " "); 
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
				sb.append(A+B + "\n");
		}
		br.close();
		System.out.println(sb);
		
	}

}
