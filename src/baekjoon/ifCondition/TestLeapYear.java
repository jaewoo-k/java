package baekjoon.ifCondition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLeapYear {
/*
����
������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�.
1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.


�Է�
ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		
		
		if(A % 100 == 0 && A % 400 == 0) {
			System.out.println(1);
		}else if(A % 100 == 0 && A % 4 == 0) {
			System.out.println(0);
		}else if(A % 4 == 0){
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
		
		
		
	}
}
