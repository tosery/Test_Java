
public class Book 
//여기 
{
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public Book()//default 생성자
	{
		
	}
	
	public Book(int bookid, String bookname, String publisher, int price)
	{
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void printBook1() //main에서 printBook1()으로 실행
	{
		System.out.print(bookid + " ");
		System.out.print(bookname + " ");
		System.out.print(publisher + " ");
		System.out.println(price);
	}

	public int getBookid() 
	{
		return bookid;
	}

	public void setBookid(int bookid) 
	{
		this.bookid = bookid;
	}

	public String getBookname() 
	{
		return bookname;
	}

	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}

	public String getPublisher() 
	{
		return publisher;
	}

	public void setPublisher(String publisher) 
	{
		this.publisher = publisher;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	
}
