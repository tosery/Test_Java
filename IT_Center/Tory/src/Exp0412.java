
import java.util.Scanner;
public class Exp0412 {

	public static void main(String[] args) 
	{
		//Seat Ŭ���� ����.
		Seat st = new Seat();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
//try catch�� ���� �޴� ���� ���� �� (���� ������ ��)
		while(true)
		{
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >>");
			int num =  sc.nextInt();
			if(!(num>=1 && num<=4))
			{
				System.out.println("1~4�� �� �����ϼ���");
				continue;
			}
		
			if(cnt == 0)
			{
				st.reset(); //�� �¼� �ʱ�ȭ 
				cnt++;
			}
			
			switch(num)
			{
			case 1:
				st.reserve();
				break;
			case 2:
				st.view();
				break;
			case 3:
				st.cancel();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
	
}

