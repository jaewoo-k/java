package baekjoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNum {
/**
�ִ�
2562����
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� �ٸ� 9���� �ڿ���

3, 29, 38, 12, 57, 74, 40, 85, 61

�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

�Է�
ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int index = 0;
		int[] arr1 = {Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine())};
//		int[] arr1 = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int temp = 0;	// ���� ��
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > temp) {
				temp = arr1[i];
				index = i;
			}
		}
		System.out.println(temp);
		System.out.println(index+1);
		br.close();
	}

}
