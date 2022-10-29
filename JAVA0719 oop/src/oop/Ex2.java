package oop;

class Animal{
	String name;
	int age;
	
	void cry() {
		System.out.println("동물 울음 소리!");
	}
}




public class Ex2 {

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "멍멍이";
		ani.age  = 3;
		System.out.println("이름: " + ani.name + ", 나이:" + ani.age);
		ani.cry();
	
		
		Animal ani2 = new Animal();
		ani2.name = "야옹이";
		ani2.age  = 2;
		System.out.println("이름: " + ani2.name + ", 나이:" + ani2.age);
		System.out.println("--------------------------");
	
		
		Student s1 = new Student();
		System.out.println("이름: "+ s1.name);
		System.out.println("학번: "+ s1.id);
		System.out.println("나이: "+ s1.age);
		
		Student s2 = new Student();
		System.out.println("이름: "+ s2.name);
		System.out.println("학번: "+ s2.id);
		System.out.println("나이: "+ s2.age);
		
		System.out.println("------------------------------------");
	
		s1.name = "김영훈";
		s1.age = 25;
		s1.id = "a112545";
		s1.kor = 100;
		s1.eng = 80;
		s1.mat = 50;
		

//		System.out.println("이름: "+ s1.name);
//		System.out.println("학번: "+ s1.id);
//		System.out.println("나이: "+ s1.age);
//		System.out.println("국어점수: "+ s1.kor);
//		System.out.println("영어점수: "+ s1.eng);
//		System.out.println("수학점수: "+ s1.mat);
		s1.showStudentInfo();
		System.out.println("-----------------------------------");
		s2.showStudentInfo();
		
		System.out.println("------------------------------------");
		System.out.println("합계: " + s1.getTotal());
		System.out.println("합계: " + s2.getTotal());
		
		System.out.println("평균: " + s1.getAverage());
		System.out.println("평균: " + s2.getAverage());
	}

}


class Student {
   	  String name;
	  String id;
	  int age;
	  int kor;
	  int eng;
	  int mat;
	
	  public void showStudentInfo() {
		  
	  	System.out.println("이름: "+ name);
		System.out.println("학번: "+ id);
		System.out.println("나이: "+ age);
		System.out.println("국어점수: "+ kor);
		System.out.println("영어점수: "+ eng);
		System.out.println("수학점수: "+ mat);
		  
	 }
	  
	  
	  public int getTotal() {
//		  int sum = kor + eng + mat;
//		  return sum;
		  return kor + eng + mat;
	  }
	  
	  
	  public double getAverage() {
//		  double avg = (kor + eng + mat) / 3.0;
//		  return avg;
		  return getTotal() / 3.0;
	  
	  }
	  
	  
	  
	  
}

















