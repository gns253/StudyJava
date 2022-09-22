package try_catch;

public class Ex2 {

	public static void main(String[] args) {

		
		System.out.println("프로그램 시작!");
		
		try {
			System.out.println("try 블록 시작!");
			int num1 = 3;
			int num2 = 0;
			
			System.out.println(num1 / num2);
			
			System.out.println("try 블록 끝!");
			
		} catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException 예외발생! - 0으로 나눌 수 없습니다!");
		
		}
		
		System.out.println("프로그램 종료!");
		
		System.out.println("===================================");
		
		System.out.println("프로그램 시작!");
		
		try {
			System.out.println("try 블록 시작!");
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]);
			System.out.println("try 블록 끝!");
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생!");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!");
		
		System.out.println("===================================");
		
		System.out.println("프로그램 시작!");
		
		try {
			System.out.println("try 블록 시작!");
			String str = null;
			System.out.println(str.length());
			System.out.println("try 블록 끝!");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외 발생!");
		}
		
		System.out.println("프로그램 종료!");
		
		
		
		
		
		
		
	}

}
