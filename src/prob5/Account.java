package prob5;

public class Account {

	private String accountNo;
	private int balance;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accountNo) {
		// TODO Auto-generated constructor stub

		this.accountNo=accountNo;
		this.balance=0;
		System.out.println(this.accountNo+" 계좌가 개설되었습니다.");
	}

	public String getAccountNo() {
		// TODO Auto-generated method stub
		return accountNo;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void save(int money) {
		// TODO Auto-generated method stub

		System.out.println(this.accountNo+" 계좌에 "+money+"만원이 입금되었습니다.");
		balance+=money;
	}

	public void deposit(int money) {
		// TODO Auto-generated method stub
		System.out.println(this.accountNo+" 계좌에 "+money+"만원이 출금되었습니다.");
		balance-=money;
	}
}