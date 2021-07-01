package baekjoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNum {
/**
최댓값
2562문제
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int index = 0;
		int[] arr1 = {Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine()),
                     Integer.parseInt(br.readLine())};
//		int[] arr1 = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int temp = 0;	// 비교할 수
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > temp) {
				temp = arr1[i];
				index = i;
			}
		}
		System.out.println(temp);
		System.out.println(index+1);
		br.close();
	}

}
