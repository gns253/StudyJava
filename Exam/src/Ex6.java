
public class Ex6 {

	public static void main(String[] args) {
		/*
		 * if문을 사용하여 입력받은 문자(ch)에 대한 판별 결과를 출력하시오.
		 * 1. 문자 1개를 ch에 저장한다.
		 * 2. 다음 조건에 따라 문자를 판별 후 결과를 출력한다.
		 * 	1) 대문자 ('A' ~ 'Z' 까지)
		 * 	2) 소문자 ('a' ~ 'z' 까지)
		 * 	3) 문자형 숫자 ('0' ~ '9' 까지)
		 * 	4) 위 모든 조건이 만족하지 않을 경우 기타문자
		 * 
		 * */
		char ch = 'A';
		if(ch >= 'A' && ch <= 'Z') { // 대문자
			
		} else if(Character.isLowerCase(ch)) { // 소문자
			
		} else if(Character.isDigit(ch)) { // 문자형 숫자
			
		}
		
	}

}
