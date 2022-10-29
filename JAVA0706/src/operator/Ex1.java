package operator;

public class Ex1 {

	public static void main(String[] args) {


	int x1 = 5;
	int y1 = ++x1;
	
	System.out.println("x1: " + x1 + ", y1: " + y1);
	
	int x2 = 5;
	int y2 = x2++;
	
	System.out.println("x1: " + x1 + ", y1: " + y1);
	System.out.println("x2: " + x2 + ", y2: " + y2);

	System.out.println("==============================");
	
	int x = 10, y = 5;
	int z = ++x + y--;
	
	System.out.println(x +"," + y +"," + z);
	
	int i = 3;
	i++;
	System.out.println(i);
	++i;
	System.out.println(i);
	
	System.out.println(++i);
	System.out.println(i++);
	System.out.println(i);
	
	
	int dan = 2;
	int index = 0;  
	
	System.out.println("<" + dan +"단" + ">");
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );
	System.out.println(dan +" x "+ ++index + " = " + dan*index );

	
	}

}
