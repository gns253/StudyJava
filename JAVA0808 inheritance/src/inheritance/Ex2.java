package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		// private 접근제한자를 갖는 멤버는 상속 대상에서 제외됨
		// => private 접근제한자는 자신의 클래스내에서만 접근 가능하고
		//    다른 클래스에서 접근 불가능 하도록 제어하므로
		//    상속받는 자식도 접근 불가능하기 때문에 상속 되지 않는다!
		SpiderMan sm = new SpiderMan();
		sm.name = "피터 파커";
		sm.age = 20;
		sm.nickName = "친절한 이웃 스파이더맨";
		sm.eat();
		sm.jump();
		sm.fireWeb();
//		sm.normalLife();
		Person P = new Person("홍길동", 20);
//		SpiderMan sm2 = new SpiderMan("피터 파커", 20);
		
	
	}

}

class Person {
	String name;
	int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메서드 정의
	public void eat() {
		System.out.println("밥 먹기!");
	}
	
	public void jump() {
		System.out.println("점프!");
	}
	
	private void normalLife() {
		System.out.println("평범한 삶");
	}
	
}

class SpiderMan extends Person {
	String nickName;
	
	public void fireWeb() {
		System.out.println("거미줄 발사!");
	}
}
























