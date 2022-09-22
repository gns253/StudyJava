package oop;

class Account2 {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo(String ownerName) {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		System.out.println("---------------------------------");
	}
	
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount);
		System.out.println("현재잔고 : " + balance);
		System.out.println("---------------------------------");
	}

	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("출금할 금액: " + amount + "원\n" + "잔액이 부족하여 출금 불가!" + "(현재잔고:" + balance + "원"  );
		} else if(amount <= balance){
			System.out.println("출금할 금액: " + amount +"원\n" + "현재잔고: " + (balance-amount) +"원" );
			balance -= amount;
		
		}
		return amount;
	}
}

public class Test2 {

	public static void main(String[] args) {
		Account2 Acc2 = new Account2();
		Acc2.accountNo = "A123123";
		Acc2.ownerName = "김영훈";
		Acc2.balance = 1000;
		
		Acc2.showAccountInfo("김영훈");
		Acc2.deposit(0);
		Acc2.withdraw(1000);
	}
	
}


