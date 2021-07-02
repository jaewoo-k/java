package baekjoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Remainder {
/**
나머지

문제
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다. 
 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
//		int[] comp = new int[10];
		//배열대신 TreeSet사용
		TreeSet<Integer> tset = new TreeSet<>();
		
		int modulus = 42; // 문제에서 주어짐
		
		// 배열에 담아주기 (사실상 배열에 담지 않고 바로바로 TreeSet에 넣어줘도 됨)
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			// tset에 modulus 결과 넣어주기
			
			int result = arr[i] % modulus;
			tset.add(result);
		}
		br.close();
		
		System.out.println(tset.size());
		
		
		
		
	}

}
