package if_;

public class Test1 {

	public static void main(String[] args) {

//		int num = -5;
//		
//		if (num < 0) {
//		};	System.out.println("변수 num = "  +  (num)  );
//		
//			
//			
//		
//		
//		if (num > 0 ){
//			System.out.println("변수 num = " +(-num));				
//			};
//		
//		
//		
//		System.out.println(num);
		
		char ch = 'a';
		if('A' <= ch &&  ch <= 'Z') {	
		
			System.out.println((char)(ch+32));
			ch += 32;
		} else 
		
		{ System.out.println((char)(ch-32));}
		
		
		
		ch = ('A' <= ch &&  ch <= 'Z') ? (char)(ch+32) : ch;
		ch = ('A' <= ch &&  ch <= 'Z') ? ch += 32 : ch;
		ch += ('A' <= ch &&  ch <= 'Z') ? 32 : 0;

		System.out.println(ch);

		
		
	}

}
