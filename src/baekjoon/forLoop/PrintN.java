package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintN {
/**
����
�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		long a = System.currentTimeMillis();
		for(int i = 1; i <= N; i++) {
			// StringBuilder�� ���� ���.
			
			sb.append(i);
			sb.append("\n");
//			System.out.println(i);
		}
		System.out.println(sb);
		
		long b = System.currentTimeMillis();
//		System.out.println((b-a));
		
	}
}
