
public class Book {
	private int bookNo;
	private String bookName;
	private String publisher;
	private int price;

	public Book(int bookNo, String bookName, String publisher, int price) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}

	public void show() {
		System.out.print("\t"+bookNo);
		System.out.print("\t" + bookName);
		
		if (bookName.length() > 6) {
			System.out.print("\t\t" + publisher);
		} else {
			System.out.print("\t\t\t" + publisher);
		}
		
		if (publisher.length() > 7 || publisher.length() == 6) {
			System.out.print("\t" + price);
		} else {
			System.out.print("\t\t" + price);
		}

		System.out.println();
	}

}
