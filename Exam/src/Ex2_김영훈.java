import java.util.Random;

public class Ex2_김영훈 {

	public static void main(String[] args) {
		char ch = 'A';
		if(ch >= 'A' &&  ch <= 'Z') {	
			System.out.println("대문자");
		} else if(ch >= 'a' &&  ch <= 'z') {
			System.out.println("소문자");
		} else if(ch >= '0' &&  ch <= '9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타 문자");
		}
		
		
	}

}
