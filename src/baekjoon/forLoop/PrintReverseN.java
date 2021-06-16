package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintReverseN {
/**
����
�ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 * @throws IOException 
 * @throws NumberFormatException 
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// i�� 1���� �۰ų� ������������
		for(int i = N; i >= 1; i--) {
			sb.append(i);
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
