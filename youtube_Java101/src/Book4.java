
public class Book4 
{
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public void print_Book() 
	{
		System.out.print(bookid + " ");
		System.out.print(bookname + " ");
		System.out.print(publisher + " ");
		System.out.println(price);
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
