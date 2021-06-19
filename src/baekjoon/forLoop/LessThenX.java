package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LessThenX {
/**
X���� ���� ��

����
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)

��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

���
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
 * @param args
 * @throws IOException 
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		// N : �迭�� ũ�� (���� ���ڴ� 1~10000)
		// X : X���� ���� �� (1~10000)
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt((st.nextToken()));
			if(value < X) {
				sb.append(value + " ");
			}
		}
		System.out.println(sb);
		/*origin
		int[] arr = new int[N];
		int count = 0;
//		int[] arr2 = new int[N];
		
		// ���� ���� �о�ͼ� �迭�� ����ֱ�
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			arr[count++] = Integer.parseInt(st.nextToken());
		}
		
		// �迭�� X�� ���ؼ� count++
		count = 0;
		for(int i = 0; i < N; i++){
			if(arr[i] < X) {
				count++;
			}
		}
		
//		int[] arr2 = new int[count];
		// �迭2 ������������ �ٷ� sb�� �ְ� ���
		for(int i = 0; i < N; i++){
			if(arr[i] < X) {
				sb.append(arr[i] + " ");
			}
		}
		System.out.println(sb);
		 */
		
		
		
		
		
		
	}
}
