
public class Test1 {

	public static void main(String[] args) {

////		
////		char ch = 'a';
////		
////		String str = ('A' <= ch) && ( ch <= 'Z') ?  "대문자" :
////			 	     ('a' <= ch) && ( ch <= 'z') ?  "소문자" : "기타문자";
////		 
////		System.out.println(str);
//		
		//뷔페 기본요금 30000
		//나이를 1 ~ 100 사이의 임의의값으로 초기화
		//할인조건 나이가 5세 이하는 70%할인 65 이상이면 50% 할인 나머지는 할인없음 요금(result) 출력
		
		
		int age = 60;
		int price = 30000; 
		int result =  age <= 5   ? (int)(price * 0.3) :
					  age >= 65  ? (int)(price * 0.5) : price;
		System.out.println(result);	
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
