
public class DB_main {

	public static void main(String[] args) 
	{
		DB_Book dbBook = new DB_Book();
		dbBook.getCon();
		dbBook.getDB_Book();
		for(int i=0; i<dbBook.getBookArr().length;++i)
		dbBook.getBookArr()[i].printBook1();
	}

}
