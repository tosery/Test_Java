import java.util.Scanner;

public class DicApp 
{
	public void run() 
	{
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("�ѱ� �ܾ��?");
			String kor = sc.next();
		
			if(kor.equals("�׸�"))
				break;
			
			String eng = Dictionary.kor2Eng(kor);
			
			if(eng.equals(""))//�ش� ���� ������
				System.out.println(kor +"�� ���� ������ �����ϴ�!");
			else
				System.out.println(kor +"��(��) " + eng);
			
		}
		sc.close();
	}

}
