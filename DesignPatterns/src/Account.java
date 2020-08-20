
public class Account {
	private float balance =1000;
	public void setBalance(float balance) {
		if(balance>0) {
			this.balance = balance;
		}
	}
	public void deposit(float amount) {
		this.balance += amount;
	}
	public void withdraw(float amount) {
		this.balance -= amount;
	}
	public float getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}
