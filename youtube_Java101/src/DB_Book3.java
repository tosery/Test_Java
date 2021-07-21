import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Book3 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	Book3 book3;
	
	public DB_Book3() //생성자에서 book1객체 초기화
	{ 
		book3 = new Book3();
	} 
		
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
			int i = 0;
			while(rs.next())
			{
				book3.setBookid(rs.getInt(1));
				book3.setBookname(rs.getString(2));
				book3.setPublisher(rs.getString(3));
				book3.setPrice(rs.getInt(4));
				book3.print_Book();
				i++;
			}
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		
		}
	}
	
}
