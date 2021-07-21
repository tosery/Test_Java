import java.sql.*;

public class DB_Book2 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
//2번
	int bookidArr[];
	String booknameArr[];
	String publisherArr[];
	int priceArr[];
		
	public DB_Book2() // 배열 생성자
	{
		bookidArr = new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
	}
	
	public void getCon() //연결
	{ 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // 
		String pwd = "madang"; // 
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}
		catch (ClassNotFoundException e) 
		{
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
	
	public void getDB_Book2()
	{
		try 
		{
			stmt = con.createStatement(); 
			rs = stmt.executeQuery("SELECT * FROM book"); 
			System.out.println("ID \tNAME \tPUBLISHER \tPRICE");
			
			int i=0;
			while (rs.next()) 
			{				
				//2번 배열에 저장
				if(i==9)
				{
					break;
				}
				bookidArr[i] = rs.getInt(1);
				booknameArr[i] =rs.getString(2);
				publisherArr[i] = rs.getString(3);
				priceArr[i] =rs.getInt(4);
				i++;
			}
						
			//2번 배열 출력
			printBookArr2();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void printBookArr2() 
	{
		for(int i=0; i<bookidArr.length; ++i)
		{
			System.out.print(bookidArr[i] +" ");
			System.out.print(booknameArr[i] +" ");
			System.out.print(publisherArr[i] + " ");
			System.out.println(priceArr[i]);
		}
		
	}
	

}
