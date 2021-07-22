import java.util.Scanner;

public class MonthSchedule 
{
	int totalDay;
	Day days[];
	
	public MonthSchedule(int totalDay) 
	{
		this.totalDay = totalDay;
		
		days = new Day[this.totalDay];//30��¥�� ��ü�迭
		
		for(int i=0; i<days.length; i++)
		{
			days[i] = new Day();
		}
	}

	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(true)
		{
			System.out.print("���� (�Է�:1, ����:2, ������:3) >>");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default :
					System.out.println("1,2,3 �߿� �Է��Ͻÿ�!");
//					break;
			}
			
		}
		
	}



	private void input() 
	{
		System.out.print("��¥(1~30)?");
		Scanner sc = new Scanner(System.in);
		int nDay = sc.nextInt();
		nDay--;
		System.out.print("����(��ĭ���� �Է�)");
		String strWork = sc.next();
		days[nDay].set(strWork);
		
	}
	
	private void view() {
		System.out.print("��¥(1~30)?");
		Scanner sc = new Scanner(System.in);
		int nDay = sc.nextInt();
		nDay--;
		System.out.println(""+(nDay+1)+"���� �� ���� "+days[nDay].get()+" �Դϴ�!");
	}
	
	private void finish() {
		System.out.println("���α׷��� �����մϴ�!");
	}

}

