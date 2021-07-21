import java.util.Scanner;

public class PhoneBook 
{
	Phone phoneArr[];
	Scanner sc;
	
	//2.������
	public PhoneBook()
	{
		sc = new Scanner(System.in);
	}
	
	//3.�޼ҵ� -> ��:run()
	void set() 
	{
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο���>>>");
		int cnt = sc.nextInt();
		phoneArr = new Phone[cnt];
		
		for(int i=0; i<phoneArr.length; ++i)
		{
			String name = "";
			String tel = "";
			
			System.out.print("�̸��� ��ȭ��ȣ(��ĭ���� �Է�)>>>");
			name = sc.next();
			tel = sc.next();
			
			phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
//		sc.close();
	}
	
	String search(String name)
	{
		for(int i=0; i<phoneArr.length; ++i)
		{
//			if(phoneArr[i].name == name)
			if(phoneArr[i].getName().equals(name))
			{
				return phoneArr[i].getTel();
			}
			
		}
		
		return "";
	}

	public void run() 
	{
		set();
		
		while(true)
		{
			System.out.print("�˻��� �̸�>>");
//			Scanner sc = new Scanner(System.in);
			
			String name = sc.next();
			
			if(name.equals("�׸�")){
//				sc.close();
				break;
			}
			
			String tel = search(name);
			if(tel.equals(""))
				System.out.println(name+"�� ��ȭ��ȣ�� �����ϴ�.");
			else
				System.out.println(name+ "�� ��ȣ�� "+tel+" �Դϴ�!");
//			sc.close();
		}
		
		sc.close();
	}
	
}



