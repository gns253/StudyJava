package interface_;

public class Ex3 {

	public static void main(String[] args) {

		
		
		
	}

}

interface IHello {
	public void sayHello(String name);
}
interface IGoodBye {
	public void sayGoodbye(String name);
}
interface Itotal extends IHello, IGoodBye{
	public void greeting(String name);
}

class ISay implements Itotal {
	@Override
	public void sayHello(String name) {
		
	}
	@Override
	public void sayGoodbye(String name) {
		
	}
	@Override
	public void greeting(String name) {
		
	}
}


abstract class ISay2 implements Itotal {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayGoodbye(String name) {
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public void greeting(String name) {
//		// TODO Auto-generated method stub
//		
//	}
	
}

class ISay2SubClass extends ISay2 {

	@Override
	public void greeting(String name) {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class AbstractClass1 {
	public abstract void abstractMethod1();
}

abstract class AbstractClass2 extends AbstractClass1 {
	public abstract void abstractMethod2();
}

class NrmalClass extends AbstractClass2 {

	@Override
	public void abstractMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
		
	}
	
}







