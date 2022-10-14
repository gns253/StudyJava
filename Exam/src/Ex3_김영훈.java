import java.util.Random;

public class Ex3_김영훈 {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.accountNo = "123-45-6789";
		acc1.ownerName = "홍길동";
		acc1.balance = 10000;
		acc1.withdraw(15000);
		System.out.println(acc1.balance);
	}

}
class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " +amount+"원, "+ "현재잔고 : " + balance+"원");
	}

	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("현재잔고: " + balance +"원, " + "출금할 금액: " + amount +"원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		} else if(amount <= balance){
			System.out.println("현재잔고: " + balance +"원, " + "출금할 금액: " + amount +"원");
			balance -= amount;
			System.out.println(amount + "원이 출금 되었습니다 (현재잔고 : "+ balance +"원)" );
		
		}
		return amount;
	}
}