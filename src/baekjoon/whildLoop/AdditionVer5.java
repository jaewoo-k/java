package baekjoon.whildLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdditionVer5 {
/**
A+B - 5 �з�
 ����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

�Է��� ���������� 0 �� ���� ���´�.

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 * @throws IOException 
 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " "); 
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			
			if(A == 0 && B == 0) {
				br.close();
				break;
			}
//			else {
				sb.append(A+B + "\n");
				
//			}
		}
		 System.out.println(sb);
		
	}
}