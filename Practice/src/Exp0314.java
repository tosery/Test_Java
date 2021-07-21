import java.util.Scanner;
public class Exp0314 
{

	public static void main(String[] args) 
	{
		String course[] = {"java", "C++", "HTML5","컴퓨터 구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("과목입력>>");
			String str = sc.next();
			
			if(str.equals("그만"))
			{
				System.out.println("끝");
				break;
			}
			int i = 0;
			for(i =0; i<score.length;i++)
			{
				if(str.equals(course[i]))
				{
					System.out.println(str+"의 점수는"+score[i]);
					break;
				}
			}
			if(i==course.length)
				System.out.println("없는 과목입니다!");
		}
	}

}
