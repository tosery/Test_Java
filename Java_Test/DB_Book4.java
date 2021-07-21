import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Book4 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	private Book4 bookarr4[];//private이니깐 get set써야함
	
	public DB_Book4() //생성자에서 book1객체 초기화
	{ 
		setBookarr4(new Book4[11]);
		for(int i =0; i<getBookarr4().length ; i++)
		{
			getBookarr4()[i] = new Book4();
		}
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
				getBookarr4()[i].setBookid(rs.getInt(1));
				getBookarr4()[i].setBookname(rs.getString(2));
				getBookarr4()[i].setPublisher(rs.getString(3));
				getBookarr4()[i].setPrice(rs.getInt(4));
//				bookarr4[i].print_Book(); 출력은 main에 하자
				i++;
			}
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		
		}
	}

	public Book4[] getBookarr4() {
		return bookarr4;
	}

	public void setBookarr4(Book4 bookarr4[]) {
		this.bookarr4 = bookarr4;
	}
}
