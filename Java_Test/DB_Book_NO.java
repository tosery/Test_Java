import java.sql.*;
public class DB_Book_NO {
	Connection con;
	public DB_Book_NO(){
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "junyeong";
		String pwd = "oracle";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public void sqlRun(){
		String query = "SELECT * FROM Book";
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \tPUBLISHER \tPRICE");
			while(rs.next())
			{
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.println("\t" + rs.getInt(4));
			}
			con.close();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
