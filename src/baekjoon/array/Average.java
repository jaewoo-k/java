package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Average {
	/**
��� 1546

����
�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.

���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.

�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

���
ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
	 * @throws IOException 
	 * @throws NumberFormatException 

	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		ArrayList<Integer> list = new ArrayList<>();
		
		// ����� N
		int N = Integer.parseInt(br.readLine());

		// list�� ����ֱ�
		// sum�� socre ��� ���ϱ� 
		double sum = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int score = Integer.parseInt(st.nextToken());
			list.add(score);
			sum += score;
		}
		// �ִ� M �̾ƿ���.
		int maxValue = MaxNum(list);
		int M = maxValue;
		
		// ��� ������ ����/M*100
		double average = (sum / M)  * 100 / N;
		System.out.println(average);
				

	}


	// ArrayList���� �޾Ƽ� �ִ� �̾ƿ���. 
	private static int MaxNum(ArrayList<Integer> list) {
		int maxValue = 0;
		for(int i = 0; i < list.size(); i++) {
			if(maxValue < list.get(i)) {
				maxValue = list.get(i);
			}
		}
		return maxValue;
	}

	/*
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
		final int total = Integer.parseInt(br.readLine());
		final String[] input = br.readLine().split(" ");
		int score = 0;
		int sum = 0;
		int max = 0;
		int i = 0;
		for ( i = 0; i < input.length; i++ ) {
			score = Integer.parseInt(input[i]);
			sum += score;
			max = score > max ? score : max;
		}
		System.out.println(Math.round(sum * 10000.0 / max / total) / 100.0);
	 */
}
