
public class Main {
	public static void main(String[] args) {
	 User user = new User("Chhaya");
	 user.name = "Chhaya";
	 System.out.println(user.name);
	 user.sayHello(" World");
	 
	 TaxCalculator calc = getCalculator();
	 calc.calculatorTax();
	 
	 Account account = new Account();
	 account.deposit(100);
	 account.withdraw(20);
	 System.out.println(account.getBalance());
	 
	 //We can change the implementation details without effecting main class won't be affected
	 MailService mailService = new MailService();
	 mailService.sendEmail();
	 // to avoid tightly coupling use interfaces
	 //Interface is a contract that specifies the capabilities that a class should provide
		
	}
	public static TaxCalculator getCalculator() {
		 return new TaxCalculator2019();
	 }
}
