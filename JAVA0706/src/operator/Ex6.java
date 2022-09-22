package operator;

public class Ex6 {

	public static void main(String[] args) {

	boolean a = false;
	boolean b = true;
	//AND 연산자 ( && ) 듈다 만족하면 
	System.out.println("a(false) && a(false) = " + (a && a));
	System.out.println("a(false) && b(true) = " + (a && b));
	System.out.println("b(true) && a(false) = " + (b && a));
	System.out.println("b(true) && b(true) = " + (b && b));
	System.out.println();
	//OR 연산자 (||) 하나라도 만족하면 true	
	System.out.println("a(false) || a(false) = " + (a || a));
	System.out.println("a(false) || b(true) = " + (a || b));
	System.out.println("b(true) || a(false) = " + (b || a));
	System.out.println("b(true) || b(true) = " + (b || b));	
	System.out.println();	
	//NOT 연산자 (!)
	System.out.println("a(false) || a(false) = " + (a || a));
	System.out.println("a(false) || b(true) = " + (a || b));
	System.out.println("b(true) || a(false) = " + (b || a));
	System.out.println("b(true) || b(true) = " + (b || b));	
	
	System.out.println();	
	System.out.println("!a(false) =" + (!a));	
	System.out.println("!a(true) =" + (!b));	
	System.out.println();	

	// XOR 연산자 (^)
	System.out.println("a(false) ^ a(false) = " + (a ^ a));	
	System.out.println("a(false) ^ b(true) = " + (a ^ b));	
	System.out.println("b(true) ^ a(false) = " + (b ^ a));	
	System.out.println("b(true) ^ b(true) = " + (b ^ b));	

	//&& ,|| : lazy Evaluation 에 의해 불필요한 연산 하지않음
	int i = 10;
	boolean result = i > 5 || i++ > 5;
	System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
