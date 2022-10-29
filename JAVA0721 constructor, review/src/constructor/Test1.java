package constructor;

class Account{
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		this.accountNo = "333-3333-333";
		this.ownerName = "소지섭";
		this.balance = 100000000;
	}
	public Account(String accountNo, String ownerName, int balance) {
		System.out.println("this: " + this);
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
}


public class Test1 {

	public static void main(String[] args) {

		Account acc = new Account("222-2222-222","우영우",100000);
		System.out.println(acc.accountNo);
		System.out.println(acc.ownerName);
		System.out.println(acc.balance);
		
		System.out.println("--------------------------------------");
	}

}
