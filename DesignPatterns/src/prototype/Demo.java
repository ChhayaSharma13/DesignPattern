package prototype;

public class Demo {
	 public static void main(String[] args) {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		System.out.println(bs);
	}
}
