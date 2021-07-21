import java.sql.*;
public class DB_Book1 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	int bookid;//밑에서 말한 멤버변수들 
	String bookname;
	String publisher;
	int price;
	
	public DB_Book1( ){ } //기본생성자
	
	public void getCon() //DB에 연결하는 메서드로 만듬
	{
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "junyeong";
		String pwd = "oracle";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void sqlRun(){
		try
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Book");
			System.out.println("BOOK NO \tBOOK NAME \tPUBLISHER \tPRICE");
			while(rs.next())
			{
				bookid = rs.getInt(1); // 맨위에 멤버변수에 while문 돌때마다 임시저장이된다!!(중요)
				bookname = rs.getString(2);
				publisher = rs.getString(3);
				price = rs.getInt(4);
				print_Book(bookid, bookname, publisher, price);
			}
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		
		}
	}
	private void print_Book(int bookid, String bookname, String publisher, int price) 
	{
		System.out.print(bookid + "");
		System.out.print(bookname + "");
		System.out.print(publisher + "");
		System.out.println(price);
	}
}
