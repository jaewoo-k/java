package baekjoon.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADivisionB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		
		Double A = Double.parseDouble(arr[0]);
		Double B = Double.parseDouble(arr[1]);
		
		System.out.println(A/B);
		
	}

}
