package try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test3 {

	public static void main(String[] args) {
		
		
		System.out.println("프로그램 시작!");
		
		try {
			
			int num1 = 3, num2 = 1;
			System.out.println(num1 / num2);
			
			String str = "";
			System.out.println(str.length());
			
			int[] arr = {1};
			System.out.println(arr[1]);
			
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 : 0 으로 나눌수 없습니다!");
		} catch (NullPointerException e) {
			System.out.println("예외 발생 : null 값을 참조할 수 없습니다!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : 잘못된 인덱스를 참조합니다!");
		} catch (Exception e) {
			System.out.println("예외 발생 : 나머지 예외를 모두 처리합니다!");
		}
		
		
		System.out.println("프로그램 종료!");
		
		try {
			Class.forName("");
			
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException | ClassNotFoundException e ) {
			System.out.println("FileNotFoundException 또는 ClassNotFoundException 발생!");
		}
		
		
		
		
		
		
		
	}

}
