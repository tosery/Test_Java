
public class main 
{
	public static void main(String args[])
	{
		Customerlist C = new Customerlist();
		C.getCon();
		C.sqlRun();
		
		//2번 배열로 출력
//		C.printcustArr();
//		3번 객체로 출력
//		C.C1.printcustomer1();
		//4번 객체배열로 출력
//		for(int i=0; i<C.getCustArr().length; i++)
//			C.getCustArr()[i].printcustomer1();
		
	}
}
