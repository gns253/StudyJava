package array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열의 크기
		
		int[] arr = new int[n*2];
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			arr[i+n] = num;
		}
		
		for(int i = 0; i < n; i++) {	// 행반복
			
			// 출력
			print(i, i+n, arr);
			
//			for(int j = i; j < n + i; j++) {
//				System.out.print(arr[j] + " ");
//			}
//			System.out.println();
			
		}
		
		
		
		
	}	// main() 메서드 끝
	
	public static void print(int startIndex, int endIndex, int[] arr) {
		
		for(int i=startIndex; i < endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	// 배열확인용 출력
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// 배열 rotation
	public static void rotation(int[] arr) {
		int temp = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
	
	
	
	
	
	
	
	

}
