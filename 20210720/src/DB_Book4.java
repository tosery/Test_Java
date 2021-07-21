import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Book4 
{
	Connection con; // 멤버변수
	Statement stmt;
	ResultSet rs;
	private Book4 booklistArr[];
	public Book4[] getBookArr() //getBookArr()이놈을 Book4[]에 담는다
	{
		return booklistArr;
	}
	//Book4 클래스에서 C언어의 Struct같은 구조가 잡혀있다.
	public DB_Book4()//4 생성자에서 초기화해야함
	{
		booklistArr = new Book4[13];//객체배열생성 초기화
		for(int i=0; i<booklistArr.length; i++)
		{
			booklistArr[i] = new Book4();
		}
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
	
	public void getDB_Book4()
	{
		try 
		{
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery("SELECT * FROM book"); // 3
			System.out.println("ID \tNAME \t\tPUBLISHER \tPRICE");
			
			int i=0;
			while (rs.next()) 
			{
				booklistArr[i].setBookid(rs.getInt(1));
				booklistArr[i].setBookname(rs.getString(2));
				booklistArr[i].setPublisher(rs.getString(3));
				booklistArr[i].setPrice(rs.getInt(4));
				i++;
			}			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
