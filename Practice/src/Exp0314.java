import java.util.Scanner;
public class Exp0314 
{

	public static void main(String[] args) 
	{
		String course[] = {"java", "C++", "HTML5","��ǻ�� ����","�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("�����Է�>>");
			String str = sc.next();
			
			if(str.equals("�׸�"))
			{
				System.out.println("��");
				break;
			}
			int i = 0;
			for(i =0; i<score.length;i++)
			{
				if(str.equals(course[i]))
				{
					System.out.println(str+"�� ������"+score[i]);
					break;
				}
			}
			if(i==course.length)
				System.out.println("���� �����Դϴ�!");
		}
	}

}
