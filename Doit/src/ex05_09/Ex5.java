package ex05_09;

public class Ex5 {

	public static void main(String[] args) {
		
		Mydate date1 = new Mydate(30, 2, 2000);
		System.out.println(date1.isValid());
		Mydate date2 = new Mydate(2, 10, 2006);
		System.out.println(date1.isValid());
		Mydate date3 = new Mydate(-10, -5, 1999);
		
	}

}

class Mydate {
	private int day;
	private int month;
	private int year;
	public Mydate(int day, int month, int year) {
		if(day <=0) day = 1;
		if(month <= 0) day =1;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean isValid() {
		boolean result = true;
		if(day<1) {
			return false;
		}
//		switch (month) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			if(day > 31)result = false; break;
//		case 4: case 6: case 9: case 11:	
//			if(day > 30)result = false; break;
//		case 2: if(day > 28) result = false; break;
//		}
		
		return result;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


}