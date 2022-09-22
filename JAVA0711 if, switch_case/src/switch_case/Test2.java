package switch_case;

public class Test2 {

	public static void main(String[] args) {

		//세정수 n1 ,n2 ,n3 중 최대값 출력 ex) :최대값 : XX"
		
//	int n1 = 40, n2 = 30, n3 = 50;
//	String result ="";
//	if(n1 > n2 && n1 > n3) {
//		result ="최대값 :" + n1;
//	}else if(n2 > n1 && n2 > n3) {
//		result ="최대값 :" + n2;
//	}else {
//		result= "최대값 :" +n3;
//	}
//	
//	System.out.println(result);
	
	
	
	int n1 = 40, n2 = 30, n3 = 50;
	int max = 0;
	
	max = (n1 > n2) ? n1 : n2;
	max = (max > n3) ? max : n3;
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
