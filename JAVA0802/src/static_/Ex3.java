package static_;

public class Ex3 {

	public static void main(String[] args) {

//		System.out.println(s1.a);
		System.out.println("StaticMember.a = " + StaticMember.a);
		
//		System.out.println("StaticMember.b = " + StaticMember.b);
		
		
		StaticMember s1 =new StaticMember();
		StaticMember s2 =new StaticMember();
		System.out.println("s1.a = " + s1.a + ", s2.a = " + s2.a);
		System.out.println("s1.b = " + s1.b + ", s2.b = " + s2.b);
	
//		s1.a = 99;
		StaticMember.a = 99;
		System.out.println("s1.a = " + s1.a + ", s2.a = " + s2.a);
	
		s2.b = 999;
		System.out.println("s1.b = " + s1.b + ", s2.b = " + s2.b);
		
		System.out.println("--------------------------------------------");
		
		s1.normalMethod();
		s1.staticMethod();
		
//		StaticMember.normalMethod();
		StaticMember.staticMethod();
	}

}

class StaticMember {
	static int a = 10;
	int b = 20;
	
	public void normalMethod() {
		System.out.println("일반 메서드");
	}
	
	public static void staticMethod() {
		System.out.println("일반 메서드");
	}
}