package enum_;

import java.time.LocalDate;

public class Test1 {

	public static void main(String[] args) {
		Week week = Week.MON;
		switch (week) {
		case MON: System.out.println("하.."); break;
		case TUE: System.out.println(); break;
		case WED: System.out.println(); break;
		case THU: System.out.println(); break;
		case FRI: System.out.println("불금!"); break;
		case SAT:
		case SUN: System.out.println("주말!"); break;
		}
		
		
		
		
		
		
		
	}

}

enum Week {MON,TUE,WED,THU,FRI,SAT,SUN
	

}

