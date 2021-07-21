import java.util.Scanner;
public class Exp0304 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		int asci = (int)s;
		for(int i=97;i<=asci;i++)
		{
			for(int j=asci,alpa=97;j>=97;j--,alpa++)
			{
				if(i==(j+1))
				{
					break;
				}
				else
				{
					System.out.print((char)alpa);
				}
			}
			System.out.println();
		}
	}

}
