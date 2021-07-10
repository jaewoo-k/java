package baekjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OXQuiz {
/**
OX����
����
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.

���
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.
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
		// ù�� ���� ����.
		int LineNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < LineNum; i++) {
			char[] tempLine = br.readLine().toCharArray();
			int sum = 0;	// ��
			int dup = 0;	// �ߺ�
			
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
//		System.out.println("��");
		
		
	}

}
