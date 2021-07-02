package baekjoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Remainder {
/**
������

����
�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 

�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

���
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�. 
 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
//		int[] comp = new int[10];
		//�迭��� TreeSet���
		TreeSet<Integer> tset = new TreeSet<>();
		
		int modulus = 42; // �������� �־���
		
		// �迭�� ����ֱ� (��ǻ� �迭�� ���� �ʰ� �ٷιٷ� TreeSet�� �־��൵ ��)
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			// tset�� modulus ��� �־��ֱ�
			
			int result = arr[i] % modulus;
			tset.add(result);
		}
		br.close();
		
		System.out.println(tset.size());
		
		
		
		
	}

}
