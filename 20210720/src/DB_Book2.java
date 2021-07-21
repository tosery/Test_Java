import java.sql.*;

public class DB_Book2 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
//2��
	int bookidArr[];
	String booknameArr[];
	String publisherArr[];
	int priceArr[];
		
	public DB_Book2() // �迭 ������
	{
		bookidArr = new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
	}
	
	public void getCon() //����
	{ 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // 
		String pwd = "madang"; // 
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		}
		catch (ClassNotFoundException e) 
		{
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
				//2�� �迭�� ����
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
						
			//2�� �迭 ���
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
