import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp0315 
{
	public static void main(String[] args) 
	{
		   Scanner sc = new Scanner(System.in);
		   
		   while(true)
		   {
			   try {
				   System.out.print("�� �� �Է�->");
				   int m = sc.nextInt();
				   int n = sc.nextInt();
				   System.out.println("�� ���� ����=>" + m*n);
				   break;
			   }
			   catch(InputMismatchException e)
			   {
				   System.out.println("����~!");
				   sc.nextLine();
			   }
		   }
		   
		   sc.close();
	}
}

