
public class Book4 
{
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public Book4() {}
	
	public void printBook4() //main���� printBook4()���� ����
	{
		System.out.print(bookid + "\t");
		System.out.print(bookname + "\t");
		System.out.print(publisher + "\t");
		System.out.println(price);
	}
	
	public void setBookid(int bookid) 
	{
		this.bookid = bookid;
	}
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public void setPublisher(String publisher) 
	{
		this.publisher = publisher;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public int getBookid() 
	{
		return bookid;
	}
	public String getBookname() 
	{
		return bookname;
	}
	public String getPublisher() 
	{
		return publisher;
	}
	public int getPrice() 
	{
		return price;
	}
}
