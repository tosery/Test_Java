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
				   System.out.print("두 수 입력->");
				   int m = sc.nextInt();
				   int n = sc.nextInt();
				   System.out.println("두 수의 곱은=>" + m*n);
				   break;
			   }
			   catch(InputMismatchException e)
			   {
				   System.out.println("에러~!");
				   sc.nextLine();
			   }
		   }
		   
		   sc.close();
	}
}

