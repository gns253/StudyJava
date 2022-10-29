package break_continue;

public class Ex2 {

	public static void main(String[] args) {

			
		OUTER:
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("< " + dan + "단 >");
			INNER:
			for(int i = 1; i < 10; i++) {
				if(dan==6) {
//					break;
//					continue;
					
//					break INNER;
//					continue OUTER;
					
//					break OUTER;
//					continue OUTER;
				
				}
				
				System.out.println(dan + " * "+ i + " = "+ dan*i);
			}
			
			
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
