package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumOneToN {
/**
����
n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.

���
1���� n���� ���� ����Ѵ�.
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
		
		//BufferedWriter �� writer�޼ҵ�� int���� ����� �� ���� ������ String���� ��ȯ������Ѵ�.
		bw.write(String.valueOf(sum));
		
		// BufferedWriter �� ����Ϸ��� flush�� close�� ����� ��.
		bw.flush();
		bw.close();
		
		br.close();
	}

}
