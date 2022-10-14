
public class Ex7 {

	public static void main(String[] args) {
		/*
		 * Account 클래스 정의
		 * 
		 * 멤버변수: 계좌번호, 예금주명, 현재잔고 선언
		 * 생성자 : 모든 멤버변수를 초기화하는 생성자
		 * 메서드 : 입금 (deposit)
		 *         출금 (withdraw)
		 * */
		
		Account1 a = new Account1("111-11-111", "kim",500000 );
	}

}

class Account1 {
	String accountNo;
	String accountName;
	int balance;
	public Account1(String accountNo, String accountName, int balance) {

		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		this.balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔액부족");
		} else if(amount < balance) {
			balance-=amount;
		}
		
		return balance;
		
	}
	
}