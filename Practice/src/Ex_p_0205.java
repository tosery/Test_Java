import java.util.Scanner;
public class Ex_p_0205 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		if(num1+num2<=num3)
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		else if(num1+num3<=num2)
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		else if(num2+num3<=num1)
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		else
			System.out.println("�ﰢ���� �˴ϴ�.");
	}
}
