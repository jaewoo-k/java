package baekjoon;

import java.util.Scanner;

public class testResult {
/*
����
���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
���� ������ ����Ѵ�.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input >= 90) {
			System.out.println("A");
		}else if(input >= 80) {
			System.out.println("B");
		}else if(input >= 70) {
			System.out.println("C");
		}else if(input >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
