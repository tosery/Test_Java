import java.util.Scanner;

public class Exp0314Ans 
{
	public static void main(String[] args) 
	{
	   String course[] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
	   int score[] = {95, 88, 76, 62, 55};
	   
	   Scanner sc = new Scanner(System.in);
	   
	   while(true)
	   {
		   System.out.print("과목입력>>");
		   String str = sc.next();
		   
	//	  if(str == "그만")
		  if(str.equals("그만"))
		  {
			  System.out.println("프로그램을 종료합니다.");
			  break;
		  }
		  int i;
		  for(i=0; i<course.length; ++i)
		  {
			if(str.equals(course[i])){
				System.out.println(str +"의 점수는"+ score[i] + "입니다");
				break;
			}
		  }
		  if(i==course.length)
			  System.out.println("없는 과목입니다!");
	   }
	   sc.close();
	}
}
