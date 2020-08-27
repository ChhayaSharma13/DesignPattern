package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class ComputerPart1 {

}
interface Component{
	void showPrice();
}
class Leaf implements Component{
	int price;
	String name;
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name + " : "+ price);
	}
	
}
	
class Composite implements Component{
	String name;
	List<Component> components = new ArrayList<>();
	
	public void addComponent(Component com) {
		components.add(com);
	}
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Component c : components) {
			c.showPrice();
		}
	}
	public Composite(String name) {
		super();
		this.name = name;
	}
	
}
