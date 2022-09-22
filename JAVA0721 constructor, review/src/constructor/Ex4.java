package constructor;

class Person2{
	
	String name;
	int age;
	
	public Person2() {
		this("홍길동",20);
		System.out.println("Person2() 생성자 호출됨!");
//		name = "홍길동";
//		age = 20;
	}


	public Person2(String name) {
		this(name, 20);
		System.out.println("Person2(String) 생성자 호출됨!");
//		this.name = name;
//		age =20;
	}


	public Person2(String name, int age) {
		System.out.println("Person2(String,int) 생성자 호출됨!");
		this.name = name;
		this.age = age;
	}
	
	
}



public class Ex4 {

	public static void main(String[] args) {

		Person2 p = new Person2();
		System.out.println("이름: "+p.name);
		System.out.println("나이: "+p.age);
		System.out.println("--------------------------");
		
		Person2 p2 = new Person2("이순신");
		System.out.println("이름: "+p2.name);
		System.out.println("나이: "+p2.age);
		System.out.println("--------------------------");
	
		Person2 p3 = new Person2("우영우");
		System.out.println("이름: "+p3.name);
		System.out.println("나이: "+p3.age);
		System.out.println("--------------------------");
	
	
	
	}

}
