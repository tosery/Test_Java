import java.util.Scanner;
public class Exp0316 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		while(true)
		{
			System.out.println("----------------------------");
			System.out.println("|��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.|");
			System.out.println("----------------------------");
			System.out.print("���� ���� �� �߿��� ����>>");
			String str_user = sc.next();
			if(str_user.equals("�׸�"))
			{
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				return;
			}
			for(int i=0; i<1;i++)
			{
				int n = (int)(Math.random()*3);
				if(str_user.equals("����"))
				{
					if(str[n].equals("����"))
					{
						System.out.println("--------------------------");
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
						System.out.println("���:����, ��ǻ��: ����");
						break;
					}
					else if(str[n].equals("����"))
					{
						System.out.println("--------------------------");
						System.out.println("�����ϴ�.");
						System.out.println("���:����, ��ǻ��: ����");
						break;
					}
					else if(str[n].equals("��"))
					{
						System.out.println("--------------------------");
						System.out.println("����� �̰���ϴ�.");
						System.out.println("���:����, ��ǻ��: ��");
						break;
					}
				}
				else if(str_user.equals("����"))
				{
					if(str[n].equals("����"))
					{
						System.out.println("--------------------------");
						System.out.println("�����ϴ�.");
						System.out.println("���:����, ��ǻ��: ����");
						break;
					}
					else if(str[n].equals("����"))
					{
						System.out.println("--------------------------");
						System.out.println("����� �̰���ϴ�.");
						System.out.println("���:����, ��ǻ��: ����");
						break;
					}
					else if(str[n].equals("��"))
					{
						System.out.println("--------------------------");
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
						System.out.println("���:����, ��ǻ��: ��");
						break;
					}
				}
				else if(str_user.equals("��"))
				{
					if(str[n].equals("����"))
					{
						System.out.println("--------------------------");
						System.out.println("����� �̰���ϴ�.");
						System.out.println("���:��, ��ǻ��: ����");
						break;
					}
					else if(str[n].equals("����"))
					{
						System.out.println("--------------------------");
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
						System.out.println("���:��, ��ǻ��: ����");
						break;
					}
					else if(str[n].equals("��"))
					{
						System.out.println("--------------------------");
						System.out.println("�����ϴ�.");
						System.out.println("���:��, ��ǻ��: ��");
						break;
					}
				}
			}
		}
		
	}
}
