
public class DB_main4 
{
	public static void main(String args[])
	{
		DB_Book4 dbBook4 = new DB_Book4();
		dbBook4.getCon();
		dbBook4.getDB_Book4();
		
		for(int i=0; i<dbBook4.getBookArr().length;i++)
		{
			dbBook4.getBookArr()[i].printBook4(); //getDB_Book4()에서 가져온 레코드를 배열에 담는다.
		}
	}
}
