package BuilderEaxmple;

public class AccountBuilder {
	int accountNo;
	String name;
	String branch;
	public AccountBuilder(int accountNo, String name, String branch, String typeOfAccount, double interestRate) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.branch = branch;
		this.typeOfAccount = typeOfAccount;
		this.interestRate = interestRate;
	}

	String typeOfAccount;
	double interestRate;
	public AccountBuilder setAccountNo(int accountNo) {
		this.accountNo = accountNo;
		return this;
	}
	public AccountBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public AccountBuilder setBranch(String branch) {
		this.branch = branch;
		return this;
	}
	public AccountBuilder setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
		return this;
	}
	public AccountBuilder setInterestRate(double interestRate) {
		this.interestRate = interestRate;
		return this;
	}
	
	public AccountBuilder getAccount() {
		return new AccountBuilder(accountNo, branch, branch, branch, interestRate);
	}
}
