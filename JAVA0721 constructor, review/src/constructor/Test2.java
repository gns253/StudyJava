package constructor;

class Account2{
	String accountNo;
	String ownerName;
	int balance;
	
	public Account2() {
		this.accountNo = "111-1111-111"; 
		this.ownerName = "홍길동";
		this.balance   = 0;
	}


	public Account2(String accountNo) {
		this.accountNo = accountNo;
		this.ownerName = "홍길동";
		this.balance  = 0;
	}

	public Account2(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = 0;
	}
	


	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	
	public void showAccountInfo() {
		System.out.println(this.accountNo);
	}
	
	
}



public class Test2 {

	public static void main(String[] args) {

		Account2 acc=new Account2(); 
		System.out.println("------------------------");
		Account2 acc2 = new Account2("222-2222-222");
		System.out.println("--------------------------");
		Account2 acc3 = new Account2(null, null);
		System.out.println("----------------------------");
		Account2 acc4 = new Account2(null, null, 0);
	}

}
