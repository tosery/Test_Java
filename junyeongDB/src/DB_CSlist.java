import java.sql.*;
public class DB_CSlist 
{
	private Customer cusArr[];
	Connection con;
	Statement stmt;
	ResultSet rs;
	public Customer[] getCusArr()
	{
		return cusArr;
	}
	
	public DB_CSlist()
	{
		cusArr = new Customer[5];
		for(int i = 0; i<cusArr.length; i++)
		{
			cusArr[i] = new Customer();
		}
	}
	
	public void getCon()
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "junyeong";
		String pwd = "oracle";
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
			System.out.println("�����ͺ��̽� ���� �غ�... ...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void getDB_CSlist()
	{
		try
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM customer");
			System.out.println("ID \tNAME \tADDRESS \tPHONE");
			
			int i = 0;
			while(rs.next())
			{
				cusArr[i].setCustid(rs.getInt(1));
				cusArr[i].setName(rs.getString(2));
				cusArr[i].setAddress(rs.getString(3));
				cusArr[i].setPhone(rs.getString(4));
				i++;
			}
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
