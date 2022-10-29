package for_;

public class Test2 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <= 3; i++) {
			 sum += i;
		}
		System.out.println("1부터 정수 "+sum+" 까지의 합");
		System.out.println("------------------------------------------------");
		
		
		
		sum = 0;		//짝수의 합
		int sum2 = 0;	//홀수의 합
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 == 0) {
				sum += i;
			} else {
				sum2 += i;
			}
		
		}
		System.out.println("1 ~ 10까지 짝수합 : " + sum);
		System.out.println("1 ~ 10까지 홀수합 : " + sum2);
		
		
		
		
		
		
		
		
		
	}

}
