package if_;

public class Test1 {

	public static void main(String[] args) {

		int num1 = 4 , num2 = -3;
		char ch = 'A';
		
		if(num1 > 0) {
			System.out.println("양수");
		} else if (num1 < 0) {
			System.out.println("음수");
		} else {
			System.out.println(0);
		} 
				
		if(num2 == 0) {
			System.out.println("0");
		} else if(num2% 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		String result = "";
		if('A' <= ch && ch <= 'Z') {
			ch +=32;
			result = "ch = " +ch;
		} else if('a' <= ch && ch <= 'z') {
			ch -=32;
			result = "ch = " + ch;
		} else {
			result = "ch는 영문자가 아닙니다!";
		}
		
		System.out.println(result);
		
		int score = 80;
		String grade = "";
	
//		if(score >= 90) 		grade = "A학점";
//		else if(score >= 80) 	grade = "B학점";
//		else if(score >= 70) 	grade = "C학점";
//		else if(score >= 60)	grade = "D학점";
//		else					grade = "F학점";
		  
		grade = score >= 90 ? "A" :
				score >= 80 ? "B" :
				score >= 70 ? "C" :
				score >= 60 ? "D" : "F";
					
 		grade += "학점";
		
		
		
		
		
		System.out.println(grade);	
		
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

