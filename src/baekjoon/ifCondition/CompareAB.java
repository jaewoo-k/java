package baekjoon.ifCondition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareAB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		if(A>B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}
	}

}