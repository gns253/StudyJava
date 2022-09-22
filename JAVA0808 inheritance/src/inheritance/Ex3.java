package inheritance;

public class Ex3 {

	public static void main(String[] args) {

		Child2 c = new Child2();
		c.parentPrn();
		System.out.println("----------------------------------------");
		c.childPrn();
		System.out.println("----------------------------------------");
		Parent2 p = new Parent2();
		p.parentPrn();
	}

}

class Parent2 {
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
	
}

class Child2 extends Parent2 {
	@Override
	public void parentPrn() {
		System.out.println("서브 클래스에서 오버라이딩 된 parent()");
	}
	
	public void childPrn() {
		System.out.println("서브 클래스의 childPrn()");
	}
}

class Animal {
	String name;
	int age;
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
}

class Dog extends Animal {
	public void cry() {
		System.out.println("댕!");
	}
}

class Cat extends Animal {
	public void cry() {
		System.out.println("애옹~");
	}
}



