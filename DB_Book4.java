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
	private Book4 bookarr4[];//private�̴ϱ� get set�����
	
	public DB_Book4() //�����ڿ��� book1��ü �ʱ�ȭ
	{ 
		setBookarr4(new Book4[11]);
		for(int i =0; i<getBookarr4().length ; i++)
		{
			getBookarr4()[i] = new Book4();
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
				getBookarr4()[i].setBookid(rs.getInt(1));
				getBookarr4()[i].setBookname(rs.getString(2));
				getBookarr4()[i].setPublisher(rs.getString(3));
				getBookarr4()[i].setPrice(rs.getInt(4));
//				bookarr4[i].print_Book(); ����� main�� ����
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
