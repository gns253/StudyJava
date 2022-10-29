package array;

public class Ex1 {

	public static void main(String[] args) {
		
		int[] score;
		score = new int[5];
		System.out.println(score.length);
		System.out.println("0번 인덱스 요소: " + score[0]);
		System.out.println("1번 인덱스 요소: " + score[1]);
		System.out.println("2번 인덱스 요소: " + score[2]);
		System.out.println("3번 인덱스 요소: " + score[3]);
		System.out.println("4번 인덱스 요소: " + score[4]);

		
		score[0] = 80;
		score[1] = 100;
		score[2] = 50;
		score[3] = 90;
		score[4] = 77;
		
		System.out.println("0번 인덱스 요소: " + score[0]);
		System.out.println("1번 인덱스 요소: " + score[1]);
		System.out.println("2번 인덱스 요소: " + score[2]);
		System.out.println("3번 인덱스 요소: " + score[3]);
		System.out.println("4번 인덱스 요소: " + score[4]);
		System.out.println("----------------------------------------");
	
		for(int i = 0; i < 5; i++) {
			System.out.println(i + "번 인덱스 요소 " + score[i]);
		}
		System.out.println("----------------------------------------");
		for(int i = 0; i < score.length; i++) {
			System.out.println(i + "번 인덱스 요소 " + score[i]);
		}
		System.out.println("----------------------------------------");
	
		int[] arr = new int[10];
	
		int[] arr2 = {10, 20, 30};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		int[] arr3;
		arr3 = new int[] {10, 20, 30};
		
		System.out.println("배열 arr3의 크기: " + arr3.length);
		for(int i =0; i < arr3.length; i++) {
			System.out.println(i);
		}
	
	
	}

}
