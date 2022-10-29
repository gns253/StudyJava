package ex01_04;

public class Ex4_Q4 {

	public static void main(String[] args) {
		// 123p
		
		/*
		 * Q4)
		 * 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
		 * 
		 * 			*
		 * 		   ***
		 * 		  *****
		 * 		 *******
		 * 
		 * */
		
		int line = 4;
		int star = 1;
		int space = 3;
		
		for(int i = 0; i < line; i++) {
			
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < star; j ++) {
				System.out.print("*");
			}
			
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
			
			star += 2;
			space--;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
