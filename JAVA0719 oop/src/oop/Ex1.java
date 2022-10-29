package oop;

public class Ex1 {
	// box b1 = new box(); 
			// int a = 10;
	public static void main(String[] args) {
		
//		person p;
		
//		p = new person();
		
		person p = new person();
		
		System.out.println("이름(p.name: " + p.name);
		System.out.println("나이(p.age: " + p.age);		
		System.out.println("배고픔(p.ishungry: " + p.ishungry);		
	
		p.eat();
		p.talk();
	
		System.out.println("---------------------------");
	
		p.name ="홍길동";
		p.age = 20;
		p.ishungry = true;
		
		System.out.println("이름(p.name: " + p.name);
		System.out.println("나이(p.age: " + p.age);		
		System.out.println("배고픔(p.ishungry: " + p.ishungry);
		
		System.out.println("---------------------------");
		
		person p2 = new person();
		
		p2.name = "김영훈";
		p2.age = 25;
		p2.ishungry = false;
		
		System.out.println("이름(p2.name: " + p2.name);
		System.out.println("나이(p2.age: " + p2.age);		
		System.out.println("배고픔(p2.ishungry: " + p2.ishungry);
		
	}

}
