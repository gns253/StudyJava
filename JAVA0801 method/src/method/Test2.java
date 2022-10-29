package method;

public class Test2 {

	public static void main(String[] args) {
		OverloadingMethod om = new OverloadingMethod();
		om.add(10, 20);
		om.add(3.14, 2.2);
		om.add(100L, 200L);
		System.out.println("----------");
		om.add(10,2.2);
		om.add(10,(int)(2.2));
		om.add(3.14, (int)(100L));
		
	}

}

class OverloadingMethod {
	
	public void add(int num1, int num2) {
		System.out.println("int");
		System.out.println(num1 + num2);
	}

	public void add(double num1, double num2) {
		System.out.println("double");
		System.out.println(num1 + num2);
	}
	
	public void add(long num1, long num2) {
		System.out.println("long");
		System.out.println(num1 + num2);
	}







}