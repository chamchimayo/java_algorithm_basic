package jab_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Q. 가장 많이 출현한 수를 출력하시오.
 * 
 * - 1 2 2 3 1 4 2 2 4 3 5 3 2
 * - 정답 2 (5회)
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Main jab_03 = new Main();
		jab_03.bazzyung();
//		jab_03.author();
	}
	
	private void author() {
		int []arr = new int[100];
		
		// An = An-1 + An-2; n >= 3
		// a1 = 1, a2 = 1
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3; i < 100; i++) {
			arr[i] = arr[i - 1] + arr [i - 2];
		}
		
		for(int i = 1; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 2번째 방법
		System.out.println();
		int prevPrevNum = 1; // An-2
		int prevNum = 1;     // An-1
		
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for(int i = 3; i < 10; i++) {
			int nNum = prevPrevNum + prevNum;
			System.out.print(nNum + " ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
	}
	
	private void bazzyung() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int[] numbers =  Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int maxFrequency = 0;
		int answer = 0;
		for(int i = 1; i < 10; i++) {
			int cnt = 0;
			
			for(int j = 0; j < numbers.length; j++) {
				if(i == numbers[j]) {
					cnt++;
				}
			}
			
			if(cnt > maxFrequency) {
				maxFrequency = cnt;
				answer = i;
			}
		}
		
		System.out.println("정답 " + answer + " (" + maxFrequency + "회)");
		
	}
}