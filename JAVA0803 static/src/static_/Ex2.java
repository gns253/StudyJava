package static_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 싱글톤 (singleton)
		 * - 애플리케이션이 시작될때 어떤 클래스가 최초 한번만 메모리를 할당하고(static)
		 *   그 메모리에 인스턴스를 만들어 사용하는 디자인 패턴.
		 * - 일반적으로 java에서는 생성자를 private로 선언해서 생성 불가능하게 하고
		 *   getInstance() 메서드 작성해서 객체를 받도록 구현
		 *   => 싱글톤 패턴은 단 하나의 인스턴스를 생성해 사용하는 디자인 패턴
		 *   
		 *     
		 * */
		
		// 생성자의 private이 적용되어 객체생성할 방법이 없음
		// new Car();
		
		Car car1 = Car.getInstance();
		Car car2 = Car.getInstance();
		System.out.println(car1 == car2);
		System.out.println(car1);
		System.out.println(car2);
	
		NormalClass n1 = new NormalClass();
		NormalClass n2 = new NormalClass();
		System.out.println(n1 == n2);
		System.out.println(n1);
		System.out.println(n2);
		
	}	

}

class NormalClass {
	
}

class Car {
	static Car car;
	// 생성자를 private
	private Car() {}
	static Car getInstance(){
		if(car == null) {
			car = new Car();
		}
		return car;
	}
	
}















