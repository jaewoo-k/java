package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdditionVer7 {
/**
����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
 * @throws IOException 
 * @throws NumberFormatException 
 */
//	public static final String NEW_LINE = "\n";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
//			String[] arr = br.readLine().split(" ");
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
//			sb.append("Case #").append(String.valueOf(i)).append(": ").append(Integer.parseInt(arr 0]) + Integer.parseInt(arr[1])).append("\n");
			sb.append("Case #").append(String.valueOf(i)).append(": ").append(a + b).append("\n");
//			sb.append("Case #").append(String.valueOf(i)).append(": ").append(a + b).append(NEW_LINE);
		}
		System.out.println(sb);
		
	}
}
