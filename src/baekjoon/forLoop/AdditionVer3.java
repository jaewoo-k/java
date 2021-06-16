package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AdditionVer3 {
/**
����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * @throws IOException 
 * @throws NumberFormatException 
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; 
		int T = Integer.parseInt(br.readLine());
		
		// StringTokenizer �̿� - ver1	(80ms)
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
//			while(st.hasMoreTokens()) {
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
//			}
		}
		System.out.println(sb);
		
		
		
		// T�� �����ϴ� �ݺ��� ( split �޼ҵ� �̿�)- ver2	(84ms)
		/*
		for(int i = 0; i < T; i++) {
			String[] readLine = br.readLine().split(" ");
			int result = Integer.parseInt(readLine[0]) + Integer.parseInt(readLine[1]);
			System.out.println(result);
		}
		*/
		br.close();
//		bw.close();
		
		
		
	}
}
