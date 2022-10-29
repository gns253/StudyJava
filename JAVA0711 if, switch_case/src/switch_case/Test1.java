package switch_case;

public class Test1 {

	public static void main(String[] args) {

	
//		String grade = "";
	
//		if(score >= 90) 		grade = "A학점";
//		else if(score >= 80) 	grade = "B학점";
//		else if(score >= 70) 	grade = "C학점";
//		else if(score >= 60)	grade = "D학점";
//		else					grade = "F학점";
		int score = 90;
		String grade ="";
		if(score >= 0 && score <=100) {
			
		switch (score/10) {
		case 10:	
		case 9:		grade = "A학점";break;
		case 8:		grade = "B학점";break;
		case 7:		grade = "C학점";break;
		case 6:		grade = "D학점";break;	
		default: 	grade = "F학점";	
		break;		
		}	
		}else {	
		grade = "점수 입력 오류!";
		}
		System.out.println(grade);
		
	
	
		int grade2 = 2;
		int P = 50000;
		String result = "";
		if(grade2 == 1) {
			result+=P * 0.95 +"원";
		} else if(grade2 == 2) {
			result+=P * 0.85 +"원";
		} else if (grade2 == 3) {
			result+=P * 0.7 +"원";
		} else {
			result = "회원 등급 오류!";
		}
		
		result = grade2 == 1 ? "결제 금액 :" + (P*0.95) + "원" :
				 grade2 == 2 ? "결제 금액 :" + (P*0.5) + "원" :
				 grade2 == 3 ? "결제 금액 :" + (P*0.7) + "원" :	"회원 등급 오류!";
		
		
		
//		switch (grade) {
//		case 1:
//			result = (P * 0.95)+"원";
//			break;
//
//		case 2:
//			result = (P * 0.85+"원");
//			break;
//		case 3:
//			result = (P * 0.70+"원");
//			break;
//		
//		default:
//			break;
//		}
//		
		
		
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	{		
		
	}

}
