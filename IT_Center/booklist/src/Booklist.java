import java.sql.*;

import javax.print.attribute.standard.JobKOctets;

public class Booklist {
	Connection con;
	Statement stmt;
	ResultSet rs;

	// ����ȣ��Ʈ �ڸ��� ip�ּ� ����.
	public Booklist() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "madang";
		String pwd = "madang";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("�����ͺ��̽� ���� �غ� ...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void sqlRun() {
		String query = "SELECT * FROM Book";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			while (rs.next()) {

					int bookNo = rs.getInt(1);
					String bookName = rs.getString(2);
					String publisher = rs.getString(3);
					int price = rs.getInt(4);
					
					Book bk = new Book(bookNo,bookName,publisher,price);

					bk.show();
			}
			System.out.println("����Ǿ����ϴ�...");

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
