package array;

public class Test3 {

	public static void main(String[] args) {

		int[] north = {70, 80, 60, 20, 30, 50, 10, 80, 77, 89};
		int[] south = {70, 60, 40, 50, 55, 65, 23, 44, 37, 88};
		int[] bridge= {2, 4, 6};
		int[] total = new int[bridge.length];
		
		int sum = 0;
		for(int i = 0; i < 3; i++) { //2번 다리
			sum+=north[i];
		}
		for(int i = 2; i < 10; i++) {
			sum+=south[i];
		}
			System.out.println(sum);
//////////////////////////////////////////////////////////////////////////////////////////////		
		int sum2 = 0;
		for(int i = 0; i < 5; i++) { //4번 다리
			sum2+=north[i];
		}
		for(int i = 4; i < 10; i++) {
			sum2+=south[i];
		}
			System.out.println(sum2);
//////////////////////////////////////////////////////////////////////////////////////////////
		int sum3 = 0;
		for(int i = 0; i < 7; i++) { //6번 다리
			sum3+=north[i];
		}
		for(int i = 6; i < 10; i++) {
			sum3+=south[i];
		}
			System.out.println(sum3);
//////////////////////////////////////////////////////////////////////////////////////////////

	
	
	}

}
