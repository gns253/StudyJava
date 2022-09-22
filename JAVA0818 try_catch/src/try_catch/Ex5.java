package try_catch;

public class Ex5 {

	public static void main(String[] args) {

		try {
			System.out.println("1 - try 블록 시작!");
			
			int num1 = 3;
			int num2 = 1;
			
			System.out.println(num1 /num2);
		
			System.out.println("2 - 예외 미발생. try 블록 끝!");
		
		} catch(Exception e) {
			System.out.println("3 - catch 블록 시작! 원인 : " + e.getMessage());
		} finally {
			System.out.println("4 - finally 블록 시작! 언제나 실행되는 코드!");
		}
		
		System.out.println("5 - try 구문 끝");
		
		System.out.println("==================================================");
		System.out.println("메서드 호출 시작!");
		method();
		System.out.println("메서드 호출 종료!");
		
	}//main() 메서드 끝

	public static void method() {
		
		try {
			System.out.println("1 - try 블록 시작!");
			
			int num1 = 3;
			int num2 = 0;
			
			System.out.println(num1 /num2);
		
			System.out.println("2 - 예외 미발생. try 블록 끝!");
		
			return;
		} catch(Exception e) {
			System.out.println("3 - catch 블록 시작! 원인 : " + e.getMessage());
		} finally {
			System.out.println("4 - finally 블록 시작! 언제나 실행되는 코드!");
		}
		
		System.out.println("5 - try 구문 끝");
		
	}
		
	
	
	
	
	
	
	
}
