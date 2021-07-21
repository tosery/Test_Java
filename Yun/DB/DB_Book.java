import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_Book 
{
	Connection con; // �������
	Statement stmt;
	ResultSet rs;
	
	
	//1��: ����
	int bookid;
	String bookname;
	String publisher;
	int price;
	
	//2��: �迭 - �����ڿ��� �ʱ�ȭ �ʿ�
	int bookidArr[];
	String booknameArr[];
	String publisherArr[];
	int priceArr[];
	
	//3��: ��ü - �����ڿ��� �ʱ�ȭ �ʿ�
	Book book1;
	
	//4��: ��ü �迭 - �����ڿ��� �ʱ�ȭ �ʿ�
	private Book bookArr[];
	
	public Book[] getBookArr() {
		return bookArr;
	}

	//2.������
	public DB_Book() {
		//2�� �迭 ���� �ʱ�ȭ
		bookidArr = new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
		
		//3�� ��ü ���� �ʱ�ȭ
		book1 = new Book();
		
		//4�� ��ü�迭 ���� �ʱ�ȭ
		bookArr = new Book[10];
		
		for(int i=0; i<bookArr.length;++i)
			bookArr[i] = new Book();
	}
	

//	public Booklist() {
	public void getCon() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // c##�߰�
		String pwd = "madang"; // c##�߰�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		try {
			System.out.println("�����ͺ��̽� ���� �غ� .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getDB_Book() { // ������
//		String query = "SELECT * FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery("SELECT * FROM book"); // 3
			System.out.println("ID \tNAME \tPUBLISHER \tPRICE");
			
			int i=0;
			while (rs.next()) 
			{
//				System.out.print(rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t" + rs.getInt(4));
				
				//1�� ������ ����
//				bookid = rs.getInt(1);
//				bookname =rs.getString(2);
//				publisher = rs.getString(3);
//				price =rs.getInt(4);
				
				//1�� ������ ���
				//printBook(bookid, bookname, publisher, price);
				
				//2�� �迭�� ����
//				bookidArr[i] = rs.getInt(1);
//				booknameArr[i] =rs.getString(2);
//				publisherArr[i] = rs.getString(3);
//				priceArr[i] =rs.getInt(4);
//				
//				i++;
				
				//3�� ��ü�� ����(���� �ȵ�)
//				book1.bookid = rs.getInt(1);
//				book1.bookname =rs.getString(2);
//				book1.publisher = rs.getString(3);
//				book1.price =rs.getInt(4);
				
				//3�� ��ü�� ����
//				book1.setBookid(rs.getInt(1));
//				book1.setBookname(rs.getString(2));
//				book1.setPublisher(rs.getString(3));
//				book1.setPrice(rs.getInt(4));
				
//				printBook(book1.bookid, book1.bookname, book1.publisher, book1.price);
//				printBook(book1.getBookid(), book1.getBookname(),
//						  book1.getPublisher(), book1.getPrice());
//				//3�� ��ü�� ��ó�� ��������, �Ʒ�ó��
//				book1.printBook1();
				
				//4�� ��ü �迭�� ����
				//bookArr[i] = new Book();//�� �κ��� �����ڷ� ������.
				
//				bookArr[i].setBookid(rs.getInt(1));
//				bookArr[i].setBookname(rs.getString(2));
//				bookArr[i].setPublisher(rs.getString(3));
//				bookArr[i].setPrice(rs.getInt(4));
				
				bookArr[i] = new Book(rs.getInt(1),
									  rs.getString(2),
									  rs.getString(3),
									  rs.getInt(4));
//				
//				//4�� ��ü �迭 ���
//				bookArr[i].printBook1();
				//4�� ����� �ܺο��� ��� ��õ
				
				i++;

			}
			
			//1�� ������ while �ۿ��� ����ϸ�, ������ ���� ����(���)
//			printBook(bookid, bookname, publisher, price);
			
			//2�� �迭 ���
			//printBookArr();//
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	//1�� ���� ��¿�, 3�� ��ü������ ����� �� ������ �ϸ� ������!
	private void printBook(int bookid, String bookname, String publisher, int price) {
		System.out.print(bookid +" ");
		System.out.print(bookname +" ");
		System.out.print(publisher + " ");
		System.out.println(price);
		
	}

	//2�� �迭 ��¿�
	public void printBookArr() 
	{
		for(int i=0; i<bookidArr.length; ++i)
		{
			System.out.print(bookidArr[i] +" ");
			System.out.print(booknameArr[i] +" ");
			System.out.print(publisherArr[i] + " ");
			System.out.println(priceArr[i]);
		}
		
	}



	
//	public void printCustomer() { // ������
////		String query = "SELECT * FROM book";
//		try {
//			stmt = con.createStatement(); // 2
//			
//			rs = stmt.executeQuery("SELECT * FROM customer"); // 3
//			
//			System.out.println("ID \tNAME \tPUBLISHER \tPRICE");
//			while (rs.next()) {
//				System.out.print(rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t" + rs.getString(4));
//
//			}
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

//	public static void main(String args[]) { // �޼ҵ��̸鼭 ���α׷����࿡ ������
//		Booklist so = new Booklist();
//		so.sqlRun();
//	}
}
