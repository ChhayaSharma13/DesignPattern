import memento.Editor;

public class Main {
	public static void main(String[] args) {
	 User user = new User("Chhaya");
	 user.name = "Chhaya";
	 System.out.println(user.name);
	 user.sayHello(" World");
	// to avoid tightly coupling use interfaces
	//Interface is a contract that specifies the capabilities that a class should provide
	
	 TaxCalculator calc = getCalculator();
	 calc.calculatorTax();
	 
	 //Encapsulation
	 Account account = new Account();
	 account.deposit(100);
	 account.withdraw(20);
	 System.out.println(account.getBalance());
	 
	 //We can change the implementation details without effecting main class won't be affected
	 MailService mailService = new MailService();
	 mailService.sendEmail();
	 
	 //Inheritance
	 TextBox textBox = new TextBox();
	 textBox.enable();
	 
	 //Polymorphism
	 drawUIControl(new CheckBox());
	 
	 Editor editor = new Editor();
	 editor.setContent("a");
	 editor.setContent("b");
	 editor.setContent("c");
	 
	 
	 
	}
	public static TaxCalculator getCalculator() {
		 return new TaxCalculator2019();
	 }
	public static void drawUIControl(UIControl control) {
		control.draw();
	}
}
