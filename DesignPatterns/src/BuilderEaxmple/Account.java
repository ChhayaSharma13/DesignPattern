package BuilderEaxmple;

public class Account {
	int accountNo;
	String name;
	String branch;
	String typeOfAccount;
	double interestRate;
	public Account(int accountNo, String name, String branch, String typeOfAccount, double interestRate) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.branch = branch;
		this.typeOfAccount = typeOfAccount;
		this.interestRate = interestRate;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", branch=" + branch + ", typeOfAccount="
				+ typeOfAccount + ", interestRate=" + interestRate + "]";
	}
	
	
}
