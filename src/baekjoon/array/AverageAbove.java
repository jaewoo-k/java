package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AverageAbove {
/**
����� �Ѱ���?
����
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 * @throws IOException 
 * @throws NumberFormatException 
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// �׽�Ʈ���̽� ���� C
		int C = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < C; i++) {
			// �ٸ��� ����� ���ϱ�
			// ��� �ʰ��ϴ� �л� "�ݿø�"�Ͽ� "�Ҽ� ��°"�ڸ����� ���
			st = new StringTokenizer(br.readLine());
			// �л��� �� N
			double N = Double.parseDouble(st.nextToken());
			int sum = 0;		// ���� ����
			double avg = 0; 	// ���� ���
			double above = 0;		// ��� �̻� �� 
			double[] person = new double[(int) N];
			for(int j = 0; j < N; j++) {
				person[j] = Integer.parseInt(st.nextToken());
				sum += person[j]; 
			}
			avg = sum / N;
			
			// ��� �ʰ��� ����� �� (above ���ϱ�)
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
