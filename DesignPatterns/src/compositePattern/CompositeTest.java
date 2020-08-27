package compositePattern;

public class CompositeTest {
	public static void main(String[] args) {
		Component hd = new Leaf(4000, "HDD");
		Component mouse = new Leaf(500, "Mouse");
		Component monitor = new Leaf(8000, "monitor");
		Component ram = new Leaf(2000, "Ram");
		Component cpu = new Leaf(10000, "CPU");
		

		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		computer.addComponent(mb);
		
		computer.showPrice();
	}
}
