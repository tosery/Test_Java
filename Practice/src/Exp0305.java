import java.util.Scanner;
public class Exp0305 
{
	public static void main(String[] args) 
	{
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10] ;
		for(int i = 0; i<10; i++)
		{
			arr[i] = sc.nextInt();
			if(i==0)
			{
				System.out.print("3�� �����: ");
			}
			if(arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}

}
