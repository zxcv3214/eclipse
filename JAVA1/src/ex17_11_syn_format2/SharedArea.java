package ex17_11_syn_format2;

public class SharedArea {
	private Account account1;//회사 계좌
	private Account account2;//직원 계좌
	
	SharedArea(Account account1, Account account2) {
		this.account1=account1;
		this.account2=account2;
	}
	//메소드를 동기화하기
	synchronized void transfer() { //계좌 이체를 한다.
		 
			account1.withdraw(1000000);
			account2.deposit(1000000);
		
	}//transfer() end
	
	synchronized int getTotal() {	
		
			return account1.getBalance() + account2.getBalance();
	
	}//getTotal() end
	
	public Account getAccount1() {
		return account1;
	}

	public void setAccount1(Account account1) {
		this.account1 = account1;
	}

	public Account getAccount2() {
		return account2;
	}

	public void setAccount2(Account account2) {
		this.account2 = account2;
	}	

	
		
}
