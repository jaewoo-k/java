package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar2 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	

		StringBuilder sb = new StringBuilder();


/* ver1
		for(int i = 0; i < n; i++){
			// i+1 : i가 1부터 시작이 아니기 때문에, 초기값이 3번이아닌 2번을 찍기위해 +1
			// j2 < n : 
			for (int j2 = i+1; j2 < n; j2++) {
				System.out.print(" ");
			}
//			for(int j1 = n; n-i <= j1 ; j1--) {
			for(int j1 = n; j1-i <= n ; j1++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
*/
// ver2
		for(int i = 0; i < n; i++){
			// i+1 : i가 1부터 시작이 아니기 때문에, 초기값이 3번이아닌 2번을 찍기위해 +1
			// j2 < n : 
			for (int j2 = i+1; j2 < n; j2++) {
				sb.append(" ");
			}
//			for(int j1 = n; n-i <= j1 ; j1--) {
			for(int j1 = n; j1-i <= n ; j1++) {
				sb.append("*");
			}
			sb.append("\n");
			
		}
		System.out.println(sb);


	}
}
