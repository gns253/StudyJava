package operator;

public class Ex3 {

	public static void main(String[] args) {

	char ch = 'A';
	System.out.println(ch + 2);

	char  ch2 = (char)(ch + 2);	
	System.out.println(ch2);
	
	int i = 100;
	long l = 200;
//	int i + l;	오류 int + long = long
	int i2 = (int)(i+l);
	System.out.println(i2);	
	float f = 3.14f;
//	long l2 = l + f; 오류 long + float = float
	long l2 = (long)(l + f);	
	System.out.println(l2);
	System.out.println("=========================");
	
	System.out.println((double)10 / 3);
	System.out.println(10 / 3.0);

//	10 / 3 int / int = int
//(double)(10/3) int / int =(double)int = (double)3			
//(double)10/3 = 10 /(double)3		
		
	byte b1 = 10; byte b2 = 20, b3;
	b3 = 10 + 20;   //상수 (리터럴) 끼리의 연산은 형변환 발생 X
//	b3 = 100 + 28;  //범위초과하면 오류	
	System.out.println(b1+b2+b3);
		
		
	}

}
