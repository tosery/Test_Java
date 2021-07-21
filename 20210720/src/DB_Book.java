import java.sql.*;
public class DB_Book 
//1~4번  해보기
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	//1번 
	int bookid;
	String bookname;
	String publisher;
	int price;
	
	//1번 생성자
	public DB_Book()
	{
	}
	
	public void getCon()
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; 
		String pwd = "madang"; 
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void getDB_Book()
	{
		try 
		{
			stmt = con.createStatement(); 
			rs = stmt.executeQuery("SELECT * FROM book"); 
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			
			while(rs.next())
			{
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.println("\t" + rs.getInt(4));
			}
			
			con.close();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	}
}
