package baekjoon.whildLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdditionVer4 {
/**
A+B - 4
����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 * @throws IOException 

 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String temp;
		// readLine()�� ��ȯ ���� String�̹Ƿ� �о�� ���� ������ null
		while( (temp = br.readLine()) != null ) {
			st = new StringTokenizer(br.readLine(), " "); 
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
				sb.append(A+B + "\n");
		}
		br.close();
		System.out.println(sb);
		
	}

}
