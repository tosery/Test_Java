
import java.util.Scanner;

public class Exp0308 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int arr1[] = new int[num1];
		for(int i=0; i<arr1.length; i++) 
		{
			arr1[i] = (int)(Math.random()*10000+1);
			if(i!=0)
			{
				for(int j=0;j<i;j++)
				{
					if(arr1[i]==arr1[j])
					{
						i=i-1;
						continue;
					}
					
				}
			}

		}
		for(int i=0; i<arr1.length; i++) 
		{
			System.out.print(arr1[i] + "\t");
			if((i+1)%10==0)
			{
				System.out.println();
			}
		}	
		sc.close();
	}
		
}
//static boolean checkArr1(int arr1[], int num) //메소드와 메인 스태틱
//{
//	int checkArr(int arr[], int num)
//	{
//		for(int i=0; i<arr1.length;++i)
//		{
//			if(num == arr1[i])
//				return true;
//		}
//		return false;
//	}
//}이거를 맨 위에
