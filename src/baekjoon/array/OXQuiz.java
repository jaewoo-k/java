package baekjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OXQuiz {
/**
OX퀴즈
문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.
 * @throws IOException 
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		String example = "5" 				+ System.lineSeparator() + 
//						 "OOXXOXXOOO" 		+ System.lineSeparator() + 
//						 "OOXXOOXXOO" 		+ System.lineSeparator() + 
//						 "OXOXOXOXOXOXOX" 	+ System.lineSeparator() + 
//						 "OOOOOOOOOO" 		+ System.lineSeparator() + 
//						 "OOOOXOOOOXOOOOX"   ;
		// 첫줄 숫자 읽음.
		int LineNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < LineNum; i++) {
			char[] tempLine = br.readLine().toCharArray();
			int sum = 0;	// 합
			int dup = 0;	// 중복
			
			for(int j = 0; j < tempLine.length; j++) {
				if(tempLine[j] == 'O') {
					dup++;
				}else {
					dup = 0;
				}
				sum += dup;
			}
//			System.out.println("i : " + i + ", sum : " + sum);
			if(i == LineNum-1) {
				sb.append(sum);
			}else {
				sb.append(sum).append(System.lineSeparator());
			}
		}
		System.out.println(sb);
//		System.out.println("끝");
		
		
	}

}
