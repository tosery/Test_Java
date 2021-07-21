import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Book2 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	int bookidArr[];//�ؿ��� ���� ����迭
	String booknameArr[];
	String publisherArr[];
	int priceArr[];
	
	public DB_Book2() //�����ڿ��� ����� 11ĭ �Ҵ����ش�.
	{ 
		bookidArr = new int[11];
		booknameArr = new String[11];
		publisherArr = new String[11];
		priceArr = new int[11];
	} 
	
	private void printBookArr() 
	{
		for(int i = 0; i<bookidArr.length; i++)
		{
			System.out.print(bookidArr[i] + "");
			System.out.print(booknameArr[i] + "");
			System.out.print(publisherArr[i] + "");
			System.out.println(priceArr[i]);
		}
	}
	
	public void getCon() //DB�� �����ϴ� �޼���� ����
	{
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "junyeong";
		String pwd = "oracle";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			} catch (ClassNotFoundException e){
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
	
	public void sqlRun(){
		try
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Book");
			System.out.println("BOOK NO \tBOOK NAME \tPUBLISHER \tPRICE");
			int i = 0;
			while(rs.next())
			{
				bookidArr[i] = rs.getInt(1);
				booknameArr[i] = rs.getString(2);
				publisherArr[i] = rs.getString(3);
				priceArr[i] = rs.getInt(4);
				i++;
			}
			printBookArr();
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		
		}
	}
}
