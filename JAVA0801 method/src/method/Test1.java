package method;

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNum) {
		this.accountNo = accountNum;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void deposit(int amount) {
		this.balance+=amount;
		System.out.println("입금할 금액 : " + amount + "원");
		System.out.println("입금 후 현재잔고 : " + balance);
	}
	
}


public class Test1 {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.deposit(5000);
		
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance());
		
	}

}


