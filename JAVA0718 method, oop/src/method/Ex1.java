package method;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("동생아! 불 좀 꺼라");
		sister_1();
		System.out.println("동생이 불을 껏다!");

		System.out.println("===================================");
	
		System.out.println("동생아! 물 좀 떠다도!");
//		String result = sister_2();
//		System.out.println("동생이 갖다준것 : " + result);
		System.out.println("동생이 갖다준것 : " + sister_2());
	
		System.out.println("============================================");
	
		System.out.println("동생아! 200월 줄테니 과자 사먹어라!");
		int money = 500;
		sister_3(money);
	
		System.out.println("==============================================");
		System.out.println("동생아! 1000원 줄테니 나도 새우깡 좀 사다도!");
		String snack = sister_4(1000);
		System.out.println("동생이 사다준것 :" + sister_4(1000));
	}
	
	
	public static void sister_3(int money) {
		System.out.println("동생: 오빠가 과자 사먹으라고" + money +"원을 줬다!");
		money -= 200;
		System.out.println("동생: 새우깡 사먹고 " + money + "원이 남았다! ");
	}
	
	
	
	
	private static String sister_4(int money) {
		System.out.println("동생: 오빠가 과자 사오라고 "+ money + "원을 줬다!");
		money -= 200;
		System.out.println("동생: 새우깡 사고 " + money + "원이 남았다!");
		return "새우깡";
	}
	
	
	
	
	
	
	
	
	
	
	public static String sister_2() {
		System.out.println("동생: 오빠가 물을 떠오라고 시켰다!");
		String result ="물";
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	public static void sister_1() {
		System.out.println("동생: 오빠가 불을 끄라고 시켜서 불을 껏다!");
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
