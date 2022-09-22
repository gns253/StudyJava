package oop;

class Account{
	  String accountNo;
	  String ownerName;
         int balance;
	
}


public class Test1 {

	public static void main(String[] args) {
		
		Account A = new Account();
		 
		A.accountNo = "111-1111-111";
		A.ownerName = "홍길동";
		A.balance   = 100000;
		
		System.out.println("계좌번호 : " + A.accountNo);
		System.out.println("예금주명 : " + A.ownerName);
		System.out.println("현재잔고 : " + A.balance + "원");
	}

}


