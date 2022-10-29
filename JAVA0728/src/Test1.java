
public class Test1 {

	public static void main(String[] args) {


		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		int[] count = new int[money.length];
		int N = 32850;
		for(int i = 0; i < money.length; i++) {
			count[i] = N / money[i];
			N %= money[i];
		}
		
		for(int i=0; i <count.length; i++) {
			System.out.println(money[i] + "원 : " + count[i] + "개");
		}
		
	}


//	public static int change(int money, int N) {
		
//	}















}
