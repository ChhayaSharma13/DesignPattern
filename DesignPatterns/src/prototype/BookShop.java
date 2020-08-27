package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
	private String shopName;
	List<Book> books = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData() {
//		fetch book 
		for(int i=1;i<=10;i++) {
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book "+i);
			getBooks().add(b);
		}
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
}
