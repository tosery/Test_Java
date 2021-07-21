import java.util.Scanner;
public class Exp0316 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		while(true)
		{
			System.out.println("----------------------------");
			System.out.println("|컴퓨터와 가위 바위 보 게임을 합니다.|");
			System.out.println("----------------------------");
			System.out.print("가위 바위 보 중에서 선택>>");
			String str_user = sc.next();
			if(str_user.equals("그만"))
			{
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
			for(int i=0; i<1;i++)
			{
				int n = (int)(Math.random()*3);
				if(str_user.equals("가위"))
				{
					if(str[n].equals("바위"))
					{
						System.out.println("--------------------------");
						System.out.println("컴퓨터가 이겼습니다.");
						System.out.println("당신:가위, 컴퓨터: 바위");
						break;
					}
					else if(str[n].equals("가위"))
					{
						System.out.println("--------------------------");
						System.out.println("비겼습니다.");
						System.out.println("당신:가위, 컴퓨터: 가위");
						break;
					}
					else if(str[n].equals("보"))
					{
						System.out.println("--------------------------");
						System.out.println("당신이 이겼습니다.");
						System.out.println("당신:가위, 컴퓨터: 보");
						break;
					}
				}
				else if(str_user.equals("바위"))
				{
					if(str[n].equals("바위"))
					{
						System.out.println("--------------------------");
						System.out.println("비겼습니다.");
						System.out.println("당신:바위, 컴퓨터: 바위");
						break;
					}
					else if(str[n].equals("가위"))
					{
						System.out.println("--------------------------");
						System.out.println("당신이 이겼습니다.");
						System.out.println("당신:바위, 컴퓨터: 가위");
						break;
					}
					else if(str[n].equals("보"))
					{
						System.out.println("--------------------------");
						System.out.println("컴퓨터가 이겼습니다.");
						System.out.println("당신:바위, 컴퓨터: 보");
						break;
					}
				}
				else if(str_user.equals("보"))
				{
					if(str[n].equals("바위"))
					{
						System.out.println("--------------------------");
						System.out.println("당신이 이겼습니다.");
						System.out.println("당신:보, 컴퓨터: 바위");
						break;
					}
					else if(str[n].equals("가위"))
					{
						System.out.println("--------------------------");
						System.out.println("컴퓨터가 이겼습니다.");
						System.out.println("당신:보, 컴퓨터: 가위");
						break;
					}
					else if(str[n].equals("보"))
					{
						System.out.println("--------------------------");
						System.out.println("비겼습니다.");
						System.out.println("당신:보, 컴퓨터: 보");
						break;
					}
				}
			}
		}
		
	}
}
