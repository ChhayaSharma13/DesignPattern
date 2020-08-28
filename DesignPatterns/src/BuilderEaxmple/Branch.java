package BuilderEaxmple;

public class Branch {
	public static void main(String[] args) {
		Account acb = new AccountBuilder().setAccountNo(18989).setBranch("Athlone").setInterestRate(12.5).getAccount();
		
	}
}
