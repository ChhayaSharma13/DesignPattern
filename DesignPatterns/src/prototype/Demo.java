package prototype;

public class Demo {
	 public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
	
		
		
		//Single objects has two reference
		BookShop bs1 = bs.clone();
		bs.getBooks().remove(2);
		bs1.setShopName("A1");
		bs1.loadData();
		System.out.println(bs);
		System.out.println("=========");
		System.out.println(bs1);
	}
}
