import java.util.Scanner;

public class Exp0314Ans 
{
	public static void main(String[] args) 
	{
	   String course[] = {"Java", "C++", "HTML5", "��ǻ�� ����", "�ȵ���̵�"};
	   int score[] = {95, 88, 76, 62, 55};
	   
	   Scanner sc = new Scanner(System.in);
	   
	   while(true)
	   {
		   System.out.print("�����Է�>>");
		   String str = sc.next();
		   
	//	  if(str == "�׸�")
		  if(str.equals("�׸�"))
		  {
			  System.out.println("���α׷��� �����մϴ�.");
			  break;
		  }
		  int i;
		  for(i=0; i<course.length; ++i)
		  {
			if(str.equals(course[i])){
				System.out.println(str +"�� ������"+ score[i] + "�Դϴ�");
				break;
			}
		  }
		  if(i==course.length)
			  System.out.println("���� �����Դϴ�!");
	   }
	   sc.close();
	}
}
