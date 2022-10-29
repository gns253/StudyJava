package method;

public class Test1 {

	public static void main(String[] args) {

		hello();		
		System.out.println("=========================");
		hello2("안녕하세요", 5);
		System.out.println("=========================");
		int result = sum();
		System.out.println(result);
		System.out.println(sum());
		System.out.println("=========================");
		System.out.println(sum2(10));
		System.out.println("=========================");
	
	}

	public static void hello() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello World!");
		}
	}
	
	public static void hello2(String msg, int limit) {
		for(int i = 0; i < limit; i++) {
			System.out.println(msg);
		}
	}
	
	public static int sum() {
		int sum= 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int sum2(int num) {
		int sum = 0;
		for(int i = 1; i <=num ; i++) {
			sum += i;
		}
		return sum;	
		
	}
	

	public static void sum3(int limit) {
		int sum = 0;
		for(int i = 1; i <= limit; i++) {
			sum += 1;
		}
		System.out.println("return 전 : " + sum);
		if(sum > 100) return;
	
		System.out.println("return 후 : " + sum);
	}	
	
	
		








}
	