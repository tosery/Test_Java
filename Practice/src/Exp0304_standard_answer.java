import java.util.Scanner;

public class Exp0304_standard_answer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���ĺ�(�ҹ���) �Է¹ٶ�-->");
		String s = sc.next();
	
		if(s.length() != 1)
		{
			System.out.println("1���� �Է��ϼ���!");
			sc.close();
			return;
		}
		
		char c = s.charAt(0);
		
		if((c<'a') || (c>'z'))
		{
			System.out.println("�ҹ��ڰ� �ƴ�!!");
			sc.close();
			return;
		}
		
		for(char i=c; i>='a'; --i)
		{
			for(char j='a';j<=i;++j)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}

