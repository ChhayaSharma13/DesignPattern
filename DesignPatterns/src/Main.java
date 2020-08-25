import StatePattern.BrushTool;
import StatePattern.Canvas;
import StatePattern.SelectionTool;
import memento.Editor;
import memento.History;

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
	 History history = new History();
	 editor.setContent("a");
	 history.push(editor.createState());
	 editor.setContent("b");
	 history.push(editor.createState());
	 editor.setContent("c");
	 editor.restore(history.pop());
	 System.out.println(editor.getContent());
	 
	 editor.restore(history.pop());
	 System.out.println(editor.getContent());
	 
	 Canvas canvas = new Canvas();
	 canvas.setCurrentTool(new BrushTool());
	 canvas.MouseDown();
	 canvas.MouseUp();
	}
	public static TaxCalculator getCalculator() {
		 return new TaxCalculator2019();
	 }
	public static void drawUIControl(UIControl control) {
		control.draw();
	}
}
