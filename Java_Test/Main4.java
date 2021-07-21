
public class Main4 
{

	public static void main(String[] args) 
	{
		DB_Book4 bk = new DB_Book4();
		bk.getCon();
		bk.sqlRun();
		for(int i =0; i<bk.getBookarr4().length;i++)
		{
			bk.getBookarr4()[i].print_Book();
		}
	}

}
