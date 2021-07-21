import java.util.Scanner;
public class Exp0304_test 
{

	public static void main(String[] args) 
	{
		System.out.print("알파벳 소문자 1글자 입력: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.length()!=1)
		{
			System.out.println("**알파벳 소문자 1글자만 입력하세요**");
			System.out.println("**프로그램 종료합니다**");
			sc.close();
			return;
		}
		char char01 = s.charAt(0);//string을 char형으로 변환할 때 s.charAt(0)쓴다
		
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
