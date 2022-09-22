package method;

public class Ex1 {

	public static void main(String[] args) {

//		Person p = new Person();
//		p.name="~~~~";
//		System.out.println(p.name);
//		p.age= 20;
//		System.out.println(p.age);
//		p.printInfo();
		
		Student s = new Student();
		s.setName("홍길동");
		System.out.println(s.getName());
		s.setAge(20);
		s.setScore(90);
		System.out.println("이름: " + s.getName());
		System.out.println("나이: " + s.getAge());
		System.out.println("점수: " + s.getScore());
		
		s.setScore(1000000000);
		System.out.println(s.getScore());
	}

}

//alt shift s 
class Student {
	
	private String name;
	private int age;
	private int score;

	public void setName(String name) {
		this.name = name; 
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	
	

}











class Person {
	public String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		
	}


}



