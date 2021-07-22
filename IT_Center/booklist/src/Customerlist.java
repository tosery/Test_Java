import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//public class Customerlist {
//	Connection con;
//	Statement stmt;
//	ResultSet rs;
//	
//	int custid;
//	String custname;
//	String address;
//	String phone;
//	//로컬호스트 자리에 ip주소 쓴다.
//	public Customerlist()
//	{
//		String url = "jdbc:oracle:thin:@localhost:1521:XE";
//		String userid = "madang";
//		String pwd = "madang";
//		
//		try 
//		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로드 성공");
//		} catch(ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		try 
//		{
//			System.out.println("데이터베이스 연결 준비 ...");
//			con = DriverManager.getConnection(url, userid, pwd);
//			System.out.println("데이터베이스 연결 성공");
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	public void sqlRun()
//	{
//		String query = "SELECT * FROM Customer";
//		try 
//		{
//			stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
//			System.out.println("CUST NO \tCUST NAME \tADDRESS \tPHONE");
//			while (rs.next())
//			{
//				System.out.print(" " + rs.getInt(1));
//				System.out.print("\t\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t" + rs.getString(4));
//			}
//			con.close();
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//}

//변수
//public class Customerlist {
//	Connection con;
//	Statement stmt;
//	ResultSet rs;
//	
//	int custid;
//	String custname;
//	String address;
//	String phone;
//	public Customerlist()
//	{
//		String url = "jdbc:oracle:thin:@localhost:1521:XE";
//		String userid = "madang";
//		String pwd = "madang";
//		
//		try 
//		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch(ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		try 
//		{
//			con = DriverManager.getConnection(url, userid, pwd);
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	public void sqlRun()
//	{
//		String query = "SELECT * FROM Customer";
//		try 
//		{
//			stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
//			System.out.println("CUST NO \tCUST NAME \tADDRESS \tPHONE");
//			while (rs.next())
//			{
//				custid = rs.getInt(1);
//				custname = rs.getString(2);
//				address = rs.getString(3);
//				phone = rs.getString(4);
//				
//				printCustomer(custid, custname, address, phone);
//			}
//			con.close();
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	private void printCustomer(int custid,String custname, String address, String phone) {
//		System.out.print(custid +"\t\t");
//		System.out.print(custname + "\t\t");
//		System.out.print(address + "\t");
//		System.out.println(phone);
//	}
//}

////배열
//public class Customerlist {
//	Connection con;
//	Statement stmt;
//	ResultSet rs;
//	
//	int custidArr[];
//	String custnameArr[];
//	String addressArr[];
//	String phoneArr[];
//	
//	public Customerlist() {
//		custidArr = new int[5];
//		custnameArr = new String[5];
//		addressArr = new String[5];
//		phoneArr = new String[5];		
//	}
//	
////	public Customerlist()
//	public void getCon()
//	{
//		String url = "jdbc:oracle:thin:@localhost:1521:XE";
//		String userid = "madang";
//		String pwd = "madang";
//		
//		try 
//		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로드 성공");
//		} catch(ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		try 
//		{
//			System.out.println("데이터베이스 연결 준비 ...");
//			con = DriverManager.getConnection(url, userid, pwd);
//			System.out.println("데이터베이스 연결 성공");
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	public void sqlRun()
//	{
////		String query = "SELECT * FROM Customer";
//		try 
//		{
//			stmt = con.createStatement();
//			
//			ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
//			
//			System.out.println("CUST NO \tCUST NAME \tADDRESS \tPHONE");
//			
//			int i=0;
//			while (rs.next())
//			{
//				custidArr[i] = rs.getInt(1);
//				custnameArr[i] = rs.getString(2);
//				addressArr[i] = rs.getString(3);
//				phoneArr[i] = rs.getString(4);
//				
//				i++;
//			}
//			con.close();
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public void printcustArr()
//	{
//		for(int i=0; i<custidArr.length; i++)
//		{
//			System.out.print(custidArr[i]+"\t\t");
//			System.out.print(custnameArr[i]+"\t\t");
//			System.out.print(addressArr[i]+"\t");
//			System.out.println(phoneArr[i]);
//		}
//	}
//}

//객체
public class Customerlist {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	Customer C1;
	
	public Customerlist() {
		
		C1 = new Customer();
	}
	
//	public Customerlist()
	public void getCon()
	{
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "madang";
		String pwd = "madang";
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try 
		{
			System.out.println("데이터베이스 연결 준비 ...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void sqlRun()
	{
//		String query = "SELECT * FROM Customer";
		try 
		{
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
			
			System.out.println("CUSTNO CUSTNAME ADDRESS PHONE");
			
			while (rs.next())
			{
				C1.custid = rs.getInt(1);
				C1.custname = rs.getString(2);
				C1.address = rs.getString(3);
				C1.phone = rs.getString(4);
				
				C1.setcustid(rs.getInt(1));
				C1.setcustname(rs.getString(2));
				C1.setaddress(rs.getString(3));
				C1.setphone(rs.getString(4));
				
				C1.printcustomer1();
			}
			con.close();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

//public class Customerlist {
//	Connection con;
//	Statement stmt;
//	ResultSet rs;
//	
//	Customer C1;
//	private Customer custArr[];
//	
//	public Customer[] getCustArr() {
//		return custArr;
//	}
//	
//	public Customerlist() {
//		
//		C1 = new Customer();
//		
//		custArr = new Customer[5];
//		
//		for(int i=0; i<custArr.length; i++)
//			custArr[i] = new Customer();
//	}
//	
////	public Customerlist()
//	public void getCon()
//	{
//		String url = "jdbc:oracle:thin:@localhost:1521:XE";
//		String userid = "madang";
//		String pwd = "madang";
//		
//		try 
//		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로드 성공");
//		} catch(ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		try 
//		{
//			System.out.println("데이터베이스 연결 준비 ...");
//			con = DriverManager.getConnection(url, userid, pwd);
//			System.out.println("데이터베이스 연결 성공");
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	public void sqlRun()
//	{
////		String query = "SELECT * FROM Customer";
//		try 
//		{
//			stmt = con.createStatement();
//			
//			ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
//			
//			System.out.println("CUST NO \tCUST NAME \tADDRESS \tPHONE");
//			int i=0;
//			while (rs.next())
//			{
//				custArr[i] = new Customer(rs.getInt(1),
//										  rs.getString(2),
//										  rs.getString(3),
//										  rs.getString(4));
//				i++;
//			}
//			con.close();
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//}