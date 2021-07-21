import java.util.Scanner;

public class Exp0304_standard_answer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳(소문자) 입력바람-->");
		String s = sc.next();
	
		if(s.length() != 1)
		{
			System.out.println("1개만 입력하세요!");
			sc.close();
			return;
		}
		
		char c = s.charAt(0);
		
		if((c<'a') || (c>'z'))
		{
			System.out.println("소문자가 아님!!");
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

