package baekjoon.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LessThenX {
/**
X보다 작은 수

문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 * @param args
 * @throws IOException 
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		// N : 배열의 크기 (안의 숫자는 1~10000)
		// X : X보다 작은 수 (1~10000)
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt((st.nextToken()));
			if(value < X) {
				sb.append(value + " ");
			}
		}
		System.out.println(sb);
		/*origin
		int[] arr = new int[N];
		int count = 0;
//		int[] arr2 = new int[N];
		
		// 다음 한줄 읽어와서 배열에 담아주기
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			arr[count++] = Integer.parseInt(st.nextToken());
		}
		
		// 배열과 X를 비교해서 count++
		count = 0;
		for(int i = 0; i < N; i++){
			if(arr[i] < X) {
				count++;
			}
		}
		
//		int[] arr2 = new int[count];
		// 배열2 생성하지말고 바로 sb에 넣고 출력
		for(int i = 0; i < N; i++){
			if(arr[i] < X) {
				sb.append(arr[i] + " ");
			}
		}
		System.out.println(sb);
		 */
		
		
		
		
		
		
	}
}
