
public class DB_main {

	public static void main(String[] args) 
	{
		DB_CSlist dbCus = new DB_CSlist();
		dbCus.getCon();
		dbCus.getDB_CSlist();
		for(int i=0; i<dbCus.getCusArr().length;++i)
		{
			dbCus.getCusArr()[i].printCus1();
		}
	}

}
