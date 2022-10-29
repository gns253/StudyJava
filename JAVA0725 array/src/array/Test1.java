package array;

public class Test1 {

	public static void main(String[] args) {

		int[] score = {80, 100, 50, 90, 77};
		double sum = 0;

		for(int i = 0; i < score.length; i++) {
			String[] name = {"이순신","홍길동","강감찬","김태희","전지현"};
			sum += score[i];
			System.out.println(name[i] + ":" + score[i] + "점");
		}
		
		System.out.println("평균: " + sum/score.length  + "점");
		
		int max = 0;
		int min = 100;
//		for(int i = 0; i < score.length; i ++) {
//			if(max < score[i]) {
//				max = score[i];
//			}
//			
//			if(min > score[i]) {
//				min = score[i];
//			}
//		
//		}
			
		for(int i = 0; i < score.length; i++) {
			int num = score[i];
			max = max < num ? num : max;
			min = min > num ? num : min;
		}
			System.out.println("최고 점수: " + max);
			System.out.println("최저 점수: " + min);
		
		
		

		String[] class1 = {"김윤진", "차동원", "소지섭"};
		for(int i = 0; i < class1.length; i++) {
			String name = class1[i];
			System.out.println(name + "이 상담받았습니다!");
		}
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
	}

}