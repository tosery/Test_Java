import java.util.Scanner;
public class Exp0304_test 
{

	public static void main(String[] args) 
	{
		System.out.print("���ĺ� �ҹ��� 1���� �Է�: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.length()!=1)
		{
			System.out.println("**���ĺ� �ҹ��� 1���ڸ� �Է��ϼ���**");
			System.out.println("**���α׷� �����մϴ�**");
			sc.close();
			return;
		}
		char char01 = s.charAt(0);//string�� char������ ��ȯ�� �� s.charAt(0)����
		
		for(char i=char01;i>='a';i--)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
