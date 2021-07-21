import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Book4 
{
	Connection con; // �������
	Statement stmt;
	ResultSet rs;
	private Book4 booklistArr[];
	public Book4[] getBookArr() //getBookArr()�̳��� Book4[]�� ��´�
	{
		return booklistArr;
	}
	//Book4 Ŭ�������� C����� Struct���� ������ �����ִ�.
	public DB_Book4()//4 �����ڿ��� �ʱ�ȭ�ؾ���
	{
		booklistArr = new Book4[13];//��ü�迭���� �ʱ�ȭ
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
			System.out.println("����̹� �ε� ����");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			System.out.println("�����ͺ��̽� ���� �غ� .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
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
