package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		
		String example = "5" 				+ System.lineSeparator() + 
						 "OOXXOXXOOO" 		+ System.lineSeparator() + 
						 "OOXXOOXXOO" 		+ System.lineSeparator() + 
						 "OXOXOXOXOXOXOX" 	+ System.lineSeparator() + 
						 "OOOOOOOOOO" 		+ System.lineSeparator() + 
						 "OOOOXOOOOXOOOOX"   ;
		
//		br.readLine();
		
		System.out.println(example);
	}

}
