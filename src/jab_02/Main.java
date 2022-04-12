package jab_02;

import java.util.Arrays;

/**
 * Q. 피보나치 수열을 출력해라
 * 
 * - An = An-1 + An-2
 * - 1 1 2 3 5 8 13 21 34 ...
 *
 */
public class Main {

	public static void main(String[] args) {
		Main jab_02 = new Main();
		jab_02.bazzyung();
//		jab_02.author();
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
//		System.out.println();
//		int prevPrevNum = 1; // An-2
//		int prevNum = 1;     // An-1
//		
//		System.out.print(prevPrevNum + " ");
//		System.out.print(prevNum + " ");
//		
//		for(int i = 3; i < 10; i++) {
//			int nNum = prevPrevNum + prevNum;
//			System.out.print(nNum + " ");
//			
//			prevPrevNum = prevNum;
//			prevNum = nNum;
//		}
	}
	
	private void bazzyung() {
		int[] arr = new int[100];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 0; i < arr.length - 2; i++) {
			arr[i+2] = arr[i] + arr[i+1];
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
}