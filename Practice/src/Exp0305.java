import java.util.Scanner;
public class Exp0305 
{
	public static void main(String[] args) 
	{
		System.out.print("양의 정수 10개를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10] ;
		for(int i = 0; i<10; i++)
		{
			arr[i] = sc.nextInt();
			if(i==0)
			{
				System.out.print("3의 배수는: ");
			}
			if(arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}

}
