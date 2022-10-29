import java.util.Random;

public class Ex4_김영훈 {

	public static void main(String[] args) {
		
		String id = "admin";
		String jumin = "901010-1234567";
		String company = "아이티윌 부산 교육센터";
		
		if(id.equalsIgnoreCase("ADMIN")) {
			System.out.println("아이디가 일치합니다");
		} else {
			System.out.println("아이디가 일치하지 않습니다");
		}
	
		if(jumin.charAt(7)=='1' || jumin.charAt(7)=='3') {
			System.out.println("남성입니다");
		} else if(jumin.charAt(7)=='2' || jumin.charAt(7)=='4') {
			System.out.println("여성입니다");
		} else if(jumin.charAt(7)=='5' || jumin.charAt(7)=='6') {
			System.out.println("외국인입니다");
		}
		
		System.out.println(company.substring(5, 7));
		
		
		
		
	}

}
