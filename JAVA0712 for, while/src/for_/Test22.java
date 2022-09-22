package for_;

public class Test22 {

	public static void main(String[] args) {

		int a = 1, b = 10;
		int sum = 0;
		for(int i = a; i <= b; i++) {
			if(i % 3 == 0) {
				sum +=i;
			} 
		}
			System.out.println(a+"부터 "+b+"까지 3의 배수의합 :"+sum);
		
		
		String str = "짝";
		
		for(int i =1; i <= 100; i++) {
			int num = i%10;
			if(num == 3 || num == 6 || num == 9) {
				  
				  System.out.print(str);
			}else {
				  System.out.print(i);
			}
		}
			
		
		for(int i =1; i <= 100; i++) {
			switch (i%10) {
			case 3:
			case 6:
			case 9:
				System.out.print("짝");
				break;
			default:
				System.out.print(i+"짝");
			}
		}
		System.out.println("");
		System.out.println("=================================================");
		
		
//		int n =247427723;
		int count = 0;
		
//		while(n > 0) {
//			if(n % 10 == 7) {
//				count++;	
//			}
//			 n /= 10;
//		}
		
		for(int n =247427723; n > 0; n/=10) {
			if(n % 10 == 7) {
				count++;
			}
		}
		System.out.println("7의개수: "+count);
		
		
 		
		
		
		
		
		
	}

}
