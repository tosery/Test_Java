
public class DB_main {

	public static void main(String[] args) {
		DB_Book dbBook = new DB_Book();
		dbBook.getCon();
		dbBook.getDB_Book();
		
		//2�� �迭�� ���
//		bookList1.printBookArr();
//		bookList1.printBookArr();
//		bookList1.printBookArr();
		
		//3�� ��ü�� ���
//		bookList1.book1.printBook1();//���������� ���
		
		//4�� ��ü�迭 ���
//		for(int i=0; i<bookList1.bookArr.length;++i)
//			bookList1.bookArr[i].printBook1();
		//�� ����� ��������� ���� ���� ����(->private�� �ؾ���)
		
		for(int i=0; i<dbBook.getBookArr().length;++i)
			dbBook.getBookArr()[i].printBook1();
		
//		Booklist book2 = new Booklist();
//		bookList1.getCon();
//		bookList1.printCustomer();
	}

}
