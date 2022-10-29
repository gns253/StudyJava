package interface_;

public class Ex1 {

	public static void main(String[] args) {

		MySubClass msc = new MySubClass();
		msc.method1();
		msc.method2();
		
//		MyInterface.NUM1 = 10;
//		MyInterface.NUM2 = 20;
//		MySubClass.NUM1 = 10;
//		msc.NUM1 =10;
		MyInterface mi = new MySubClass();
		mi.method1();
		mi.method2();
		System.out.println(MyInterface.NUM1);
		System.out.println(MySubClass.NUM2);
	}

}

interface MyInterface {
	
	public static final int NUM1 = 10;
	int NUM2 = 20;

	public abstract void method1();
	void method2();
	
}


class MySubClass implements MyInterface {

	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메서드 method1()");
	}

	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메서드 method2()");
	}
	
}

