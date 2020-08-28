package BuilderEaxmple;

public class Account {
	int accountNo;
	String name;
	String branch;
	public Account(int accountNo, String name, String branch, String typeOfAccount, double interestRate) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.branch = branch;
		this.typeOfAccount = typeOfAccount;
		this.interestRate = interestRate;
	}

	String typeOfAccount;
	double interestRate;
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Account getAccount() {
		return new Account(accountNo, branch, branch, branch, interestRate);
	}
}
