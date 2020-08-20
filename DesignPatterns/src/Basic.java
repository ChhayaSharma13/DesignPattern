
public class Basic {
	public static void main(String[] args) {
	 User user = new User("Chhaya");
	 user.name = "Chhaya";
	 System.out.println(user.name);
	 user.sayHello(" World");
	 
	 TaxCalculator calc = getCalculator();
	 calc.calculatorTax();
	 
	 // to avoid tightly coupling use interfaces
	 //Interface is a contract that specifies the capabilities that a class should provide
		
	}
	public static TaxCalculator getCalculator() {
		 return new TaxCalculator2019();
	 }
}
