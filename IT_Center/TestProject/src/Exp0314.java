import java.util.Scanner;
public class Exp0314 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String course[] = {"Java","C++","HTML5","��ǻ�� ����","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		String cour = sc.nextLine();
		for(;;)
		{
			if(course[0].equals(cour)||course[1].equals(cour)||course[2].equals(cour)||course[3].equals(cour)||course[4].equals(cour))
			{
				if(course[0].equals(cour))
				{
					System.out.println("Java�� ������"+score[0]);
					continue;
				}
				else if(course[1].equals(cour))
				{
					System.out.println("C++�� ������"+score[1]);
				}
				else if(course[2].equals(cour))
				{
					System.out.println("HTML5"+score[2]);
				}
				else if(course[3].equals(cour))
				{
					System.out.println("��ǻ�� ����"+score[3]);
				}
				else if(course[4].equals(cour))
				{
					System.out.println("�ȵ���̵�"+score[4]);
				}
				else if(cour.equals("�׸�"))
				{
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					return;
				}
				else
				{
					System.out.println("���� �����Դϴ�.");
				}
			}
		}
	}
}

