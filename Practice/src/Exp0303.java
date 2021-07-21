import java.util.Scanner;
public class Exp0303 
{

	public static void main(String[] args) 
	{
		System.out.print("정수를 입력하시오>>");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int arr[][] = new int[num][];
		/*arr[0] = new int[5]; 어려우니깐 예시~~~
		arr[1] = new int[4];
		arr[2] = new int[3];
		arr[3] = new int[2];
		arr[4] = new int[1];*/
		for(int i=0; i<num; i++)
		{
			for(int j=num; j>=1; j--)
			{
				if(i==j)
				{
					break;
				}
				
				else
				arr[i] = new int[j];
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
