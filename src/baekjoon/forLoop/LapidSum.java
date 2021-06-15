package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;

public class LapidSum {
/*
���� A+B

 ����
���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.

C++�� ����ϰ� �ְ� cin/cout�� ����ϰ��� �Ѵٸ�, cin.tie(NULL)�� sync_with_stdio(false)�� �� �� ������ �ְ�, endl ��� ���๮��(\n)�� ����. ��, �̷��� �ϸ� �� �̻� scanf/printf/puts/getchar/putchar �� C�� ����� ����� ����ϸ� �� �ȴ�.

Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

Python�� ����ϰ� �ִٸ�, input ��� sys.stdin.readline�� ����� �� �ִ�. ��, �̶��� �� ���� ���๮�ڱ��� ���� �Է¹ޱ� ������ ���ڿ��� �����ϰ� ���� ��� .rstrip()�� �߰��� �� �ִ� ���� ����.

���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. �׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.

�ڼ��� ���� �� �ٸ� ����� ���� �� �ۿ� ����Ǿ� �ִ�.

�� ��α� �ۿ��� BOJ�� ��Ÿ ���� ���� ���� �� �� �ִ�.

�Է�
ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.
 */
	// split() ���ٴ� StringTokenizer�� ����ؼ� �ð��� ���̱�
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
//		int T = Integer.parseInt(br.readLine());
		int T = 3;
		
		
//		������
		/*
 		for(int i = 0; i < T; i++ ) {
			String[] arr = br.readLine().split(" ");
			int[] arr2 = new int[arr.length];
			
			for(int j = 0; j < arr2.length; j++) {
				arr2[j] = Integer.parseInt(arr[j]);
			}
			
			sb.append(arr2[0] + arr2[1] + "\n");
		}
		*/
		// �ð�üũ
//		long before = System.currentTimeMillis();
		for(int i = 0; i < T; i++ ) {
			st = new StringTokenizer(br.readLine(), " ");
//			String write = st.nextToken();
			
			sb.append(
					Integer.parseInt(st.nextToken()) + 
					Integer.parseInt(st.nextToken()) + 
					"\n" );
			
		}
		// ���
		bw.write(sb.toString());	
		
//		long after = System.currentTimeMillis();
//		System.out.println("�ɸ� �ð� : " + (after-before));
		// ��Ʈ�� �ݾ��ֱ�
		bw.flush();
		bw.close();
		
		br.close();
		
	}
}
