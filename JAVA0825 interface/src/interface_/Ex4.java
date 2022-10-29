package interface_;

public class Ex4 {

	public static void main(String[] args) {
		C c = new C();
		c.method();
		
		SubClass sub = new SubClass();
		sub.method();
		
		
		
		
	}

}

class A {
	public void method() {
		System.out.println("class A");
	}
	
}
interface B {
	public default void method() {
		System.out.println("interface B");
	}
}

class C extends A implements B {
	
}

interface I1 {
	public default void method() {
		System.out.println("I1의 메서드");
	}
}
interface I2 {
	public default void method() {
		System.out.println("I2의 메서드");
	}
}

class SubClass implements I1, I2 {

	@Override
	public void method() {
		System.out.println("SubClass의 메서드");
	}
	
}














