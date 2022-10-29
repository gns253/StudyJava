package break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

	
		
			
		Random r = new Random();
		int target = r.nextInt(999);

		
		Scanner sc = new Scanner(System.in);

		int count = 0;
		
		for(int i = 0; i < count; i++) {
			System.out.println("1~999 사이 정수 입력");
			int num = sc.nextInt();
			
			if(target > num) {
				System.out.println("UP");
			} else if (target < num) {
				System.out.println("DOWN");
			} else { 
				System.out.println("정답");
				break;
			}
			
		}
			System.out.println("실패(정답: "+ target + ") ^^;");
		
		
		
		
		
		
		
		
	}

}
